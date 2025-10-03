#!/bin/bash

echo "🚀 Starting Flutter-like to HTML Transpiler..."

# Check if ANTLR parsers are generated
if [ ! -d "src/antlr" ]; then
    echo "📝 Generating ANTLR parsers..."
    cd src/grammars
    java -jar ../../lib/antlr-4.12.0-complete.jar -o ../antlr -package antlr -visitor DartLexer.g4
    java -jar ../../lib/antlr-4.12.0-complete.jar -o ../antlr -package antlr -visitor DartParser.g4
    cd ../..
fi

# Check if Java classes are compiled
if [ ! -d "bin" ]; then
    echo "🔨 Compiling Java source code..."
    mkdir -p bin
    javac -cp "lib/*:src" -d bin $(find src -name "*.java")
fi

# Check if Node.js dependencies are installed
if [ ! -d "node_modules" ]; then
    echo "📦 Installing Node.js dependencies..."
    npm install
fi

# Create necessary directories
mkdir -p uploads output

echo "✨ Starting server..."
node server.js
