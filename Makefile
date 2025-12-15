# Path to ANTLR on Merlin
ANTLR_JAR=/pub/courses/vyp/antlr-4.13.2-complete.jar

# Setup classpath for compilation
CLASSPATH=.:./bin:$(ANTLR_JAR)

all:
	# 1. Clean up old file
	rm -rf src/parser
	mkdir -p bin
	mkdir -p src/parser

	# 2. Generate Parser/Lexer
	cd grammar && java -jar $(ANTLR_JAR) -o ../src/parser -package parser -no-listener -visitor VYPlanguage.g4

	# 3. Compile everything
	javac -cp $(CLASSPATH) -d bin src/parser/*.java src/semantic/*.java src/codegen/*.java src/*.java

clean:
	rm -rf bin
	rm -rf src/parser
