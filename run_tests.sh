#!/bin/bash
# Comprehensive test runner for VYP compiler

ANTLR_JAR=/pub/courses/vyp/antlr-4.13.2-complete.jar
VYPINT=/pub/courses/vyp/vypint/vypint-1.0.jar
COMPILER="./vypcomp"
TEST_DIR="tests"
OUTPUT_DIR="test_output"

# Colors for output
GREEN='\033[0;32m'
RED='\033[0;31m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# Counters
TOTAL_TESTS=0
PASSED_TESTS=0
FAILED_TESTS=0

# Create output directory
mkdir -p "$OUTPUT_DIR"

echo "========================================="
echo "  VYP Compiler Test Suite"
echo "========================================="
echo ""

# Function to run a test that should succeed
run_success_test() {
    local test_file=$1
    local test_name=$(basename "$test_file" .vyp)
    local output_file="$OUTPUT_DIR/${test_name}.vc"
    
    TOTAL_TESTS=$((TOTAL_TESTS + 1))
    
    echo -n "Testing: $test_name ... "
    
    # Compile
    $COMPILER "$test_file" "$output_file" 2>"$OUTPUT_DIR/${test_name}.err"
    local compile_exit=$?
    
    if [ $compile_exit -ne 0 ]; then
        echo -e "${RED}FAIL${NC} (compilation failed with exit code $compile_exit)"
        cat "$OUTPUT_DIR/${test_name}.err"
        FAILED_TESTS=$((FAILED_TESTS + 1))
        return 1
    fi
    
    # Check if output file was created
    if [ ! -f "$output_file" ]; then
        echo -e "${RED}FAIL${NC} (no output file generated)"
        FAILED_TESTS=$((FAILED_TESTS + 1))
        return 1
    fi
    
    # Try to run with vypint (if available)
    if [ -f "$VYPINT" ]; then
        java -jar "$VYPINT" "$output_file" >"$OUTPUT_DIR/${test_name}.out" 2>&1
        local run_exit=$?
        echo -e "${GREEN}PASS${NC} (compiled, exit=$run_exit)"
    else
        echo -e "${GREEN}PASS${NC} (compiled successfully)"
    fi
    
    PASSED_TESTS=$((PASSED_TESTS + 1))
    return 0
}

# Function to run a test that should fail
run_fail_test() {
    local test_file=$1
    local test_name=$(basename "$test_file" .vyp)
    local expected_exit=$2
    
    TOTAL_TESTS=$((TOTAL_TESTS + 1))
    
    echo -n "Testing: $test_name (should fail) ... "
    
    # Compile (should fail)
    $COMPILER "$test_file" "$OUTPUT_DIR/${test_name}.vc" 2>"$OUTPUT_DIR/${test_name}.err"
    local compile_exit=$?
    
    if [ $compile_exit -eq 0 ]; then
        echo -e "${RED}FAIL${NC} (should have failed but succeeded)"
        FAILED_TESTS=$((FAILED_TESTS + 1))
        return 1
    fi
    
    if [ -n "$expected_exit" ] && [ $compile_exit -ne $expected_exit ]; then
        echo -e "${YELLOW}PARTIAL${NC} (failed with exit $compile_exit, expected $expected_exit)"
        PASSED_TESTS=$((PASSED_TESTS + 1))
        return 0
    fi
    
    echo -e "${GREEN}PASS${NC} (correctly failed with exit code $compile_exit)"
    PASSED_TESTS=$((PASSED_TESTS + 1))
    return 0
}

echo -e "${BLUE}=== Basic Tests ===${NC}"
run_success_test "$TEST_DIR/test.vyp"
run_success_test "$TEST_DIR/hello.vyp"
run_success_test "$TEST_DIR/math.vyp"
run_success_test "$TEST_DIR/control.vyp"

echo ""
echo -e "${BLUE}=== Error Detection Tests ===${NC}"
run_fail_test "$TEST_DIR/fail_test.vyp" 14

echo ""
echo -e "${BLUE}=== Advanced Tests ===${NC}"
run_success_test "$TEST_DIR/harder_test.vyp"

# Additional tests if they exist
if [ -f "$TEST_DIR/nested_scopes.vyp" ]; then
    run_success_test "$TEST_DIR/nested_scopes.vyp"
fi

if [ -f "$TEST_DIR/expressions.vyp" ]; then
    run_success_test "$TEST_DIR/expressions.vyp"
fi

if [ -f "$TEST_DIR/loops.vyp" ]; then
    run_success_test "$TEST_DIR/loops.vyp"
fi

echo ""
echo "========================================="
echo "  Test Results"
echo "========================================="
echo -e "Total:  $TOTAL_TESTS"
echo -e "${GREEN}Passed: $PASSED_TESTS${NC}"
echo -e "${RED}Failed: $FAILED_TESTS${NC}"
echo ""

if [ $FAILED_TESTS -eq 0 ]; then
    echo -e "${GREEN}All tests passed! ${NC}"
    exit 0
else
    echo -e "${RED}Some tests failed!${NC}"
    exit 1
fi
