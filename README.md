# VYP Compiler

This project implement a compiler for VYPlanguage into VYPcode.

## Authors

This project was developped by Nuri Eyobed Awel and Julien Archambault.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Building the Compiler](#building-the-compiler)
- [Usage](#usage)
- [Testing](#testing)
- [Compilation Phases](#compilation-phases)
- [Error Codes](#error-codes)
- [Examples](#examples)

## Overview

The VYP compiler is a multi-phase compiler that processes VYP language source files (`.vyp`) and generates executable VYPcode (`.vc`) files. The compiler performs lexical analysis, parsing, semantic analysis, and code generation.

## Features

- **Object-Oriented Programming**: Support for classes and inheritance
- **Functions**: First-class functions with parameters and return values
- **Data Types**: `int`, `string`, and custom class types
- **Control Flow**: `if-else` statements and `while` loops
- **Operators**: Arithmetic (`+`, `-`, `*`, `/`), logical (`&&`, `||`, `!`), and comparison operators
- **Built-in Functions**: `print()` for output
- **Type Casting**: Cast expressions for type conversion
- **Variable Initialization**: Declaration with initialization (Extension)
- **Semantic Analysis**: Two-pass semantic checking for definitions and logic
- **Code Generation**: Generates VYPcode bytecode


## Project Structure

```
compiler/
├── src/
│   ├── Compiler.java              # Main compiler driver
│   ├── parser/                    # Generated ANTLR parser/lexer
│   │   ├── VYPlanguageParser.java
│   │   ├── VYPlanguageLexer.java
│   │   └── VYPlanguageBaseVisitor.java
│   ├── semantic/                  # Semantic analysis
│   │   ├── DefinitionVisitor.java # First pass: collect definitions
│   │   ├── LogicVisitor.java      # Second pass: check logic
│   │   ├── Scope.java             # Scope management
│   │   └── Symbol.java            # Symbol table entries
│   └── codegen/
│       └── CodeGenerator.java     # VYPcode generation
├── grammar/
│   └── VYPlanguage.g4            # ANTLR grammar definition
├── tests/                        # Test programs
├── test_output/                  # Compiled test outputs
├── bin/                          # Compiled Java classes
├── Makefile                      # Build system
├── vypcomp                       # Compiler wrapper script
└── run_tests.sh                  # Test suite runner
```

## Prerequisites

- **Java**: JDK 8 or higher
- **ANTLR4**: Version 4.13.2 (included in classpath)
- **Make**: For building using the Makefile
- **Bash**: For running test scripts (Linux/Unix/WSL)

## Building the Compiler

### Using Make

```bash
make
```

This will:
1. Clean up old files
2. Generate parser and lexer from the ANTLR grammar
3. Compile all Java source files

### Manual Build

```bash
# Generate parser
cd grammar
java -jar /path/to/antlr-4.13.2-complete.jar -o ../src/parser -package parser -no-listener -visitor VYPlanguage.g4

# Compile
cd ..
javac -cp .:./bin:/path/to/antlr-4.13.2-complete.jar -d bin src/parser/*.java src/semantic/*.java src/codegen/*.java src/*.java
```

### Clean Build

```bash
make clean
```

## Usage

### Compiling a VYP Program

```bash
./vypcomp <input_file.vyp> [output_file.vc]
```

**Examples:**

```bash
# Compile to default output (out.vc)
./vypcomp tests/hello.vyp

# Compile with custom output name
./vypcomp tests/expressions.vyp test_output/expressions.vc
```

### Running the Compiled Code

```bash
java -jar /pub/courses/vyp/vypint/vypint-1.0.jar output.vc
```

## Testing

### Run All Tests

```bash
./run_tests.sh
```

The test suite includes:
- **Success Tests**: Valid programs that should compile and run
- **Error Tests**: Programs with semantic errors that should fail compilation

### Test Files

- `hello.vyp` - Basic hello world
- `expressions.vyp` - Expression evaluation and precedence
- `control.vyp` - Control flow structures
- `loops.vyp` - While loops
- `math.vyp` - Arithmetic operations
- `nested_scopes.vyp` - Variable scoping
- `error_*.vyp` - Error test cases

## Compilation Phases

### 1. Lexical Analysis
The lexer (VYPlanguageLexer) tokenizes the input source code.

### 2. Syntax Analysis
The parser (VYPlanguageParser) builds an Abstract Syntax Tree (AST) according to the grammar rules.

### 3. Semantic Analysis

**Pass 1 - Definition Visitor**:
- Collects all function and class definitions
- Builds symbol tables and scopes
- Checks for redefinitions

**Pass 2 - Logic Visitor**:
- Type checking
- Verifies variable usage
- Validates function calls
- Checks for undefined symbols

**Main Function Requirement**:
- Every program must have a `main` function (exit code 14 if missing)

### 4. Code Generation
The CodeGenerator translates the AST into VYPcode instructions:
- Stack-based instruction set
- Label-based control flow
- Function calls and returns
- Memory management for variables

## Error Codes

| Exit Code | Description |
|-----------|-------------|
| 0 | Success |
| 14 | Semantic error (e.g., missing main function) |
| 19 | Internal compiler error |

## Examples

### Hello World

```vyp
void main(void) {
    print("Hello World\n");
}
```

### Factorial

```vyp
int factorial(int n) {
    if (n <= 1) {
        return 1;
    }
    return n * factorial(n - 1);
}

void main(void) {
    int result = factorial(5);
    print(result);
    print("\n");
}
```

### Class Example

```vyp
class Counter {
    int value;
    
    void increment(void) {
        this.value = this.value + 1;
    }
    
    int getValue(void) {
        return this.value;
    }
}

void main(void) {
    Counter c = new Counter;
    c.value = 0;
    c.increment();
    c.increment();
    print(c.getValue());
    print("\n");
}
```

## Development

### Modifying the Grammar

1. Edit `grammar/VYPlanguage.g4`
2. Run `make` to regenerate parser
3. Recompile the project

### Adding Semantic Checks

- Extend `DefinitionVisitor.java` for definition-level checks
- Extend `LogicVisitor.java` for expression and statement checks

### Extending Code Generation

- Modify `CodeGenerator.java` to add new instruction patterns
- Update visitor methods for new language features

## License

This project is part of the VYP (Formal Languages and Compilers) course.