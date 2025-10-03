# Flutter-like to HTML Transpiler

## Project Overview

This is a Java-based transpiler that converts Flutter-like syntax (.drt files) into HTML and JavaScript. It was developed as a university assignment to demonstrate compiler design concepts including lexical analysis, parsing, AST construction, and code generation.

## Architecture

### Backend (Java)
- **ANTLR4**: Lexer and parser generation from grammar files
- **Java 19**: Core transpiler logic using Composite and Visitor design patterns
- **Dependencies**:
  - antlr-4.12.0-complete.jar
  - jheaps-0.13.jar
  - jsoup-1.15.4.jar
  - jgrapht-core-1.5.2.jar (for AST visualization)
  - jgraphx-4.2.2.jar (for graph rendering - disabled in headless mode)

### Frontend (Node.js + Express)
- **Express.js**: Web server for handling HTTP requests
- **Multer**: File upload handling
- **CORS**: Cross-origin resource sharing
- **Port**: 5000 (configured for Replit environment)

## Project Structure

```
├── src/
│   ├── antlr/          # Generated ANTLR lexer and parser
│   ├── App/            # Main application entry point
│   ├── grammars/       # ANTLR grammar definitions
│   ├── visitors/       # AST visitors for code generation
│   ├── widgets/        # Widget implementations
│   ├── properties/     # Widget property definitions
│   ├── statements/     # Statement implementations
│   └── expressions/    # Expression implementations
├── lib/                # Java dependencies (JAR files)
├── bin/                # Compiled Java classes
├── output/             # Generated HTML files
├── uploads/            # Temporary uploaded files
├── public/             # Frontend static files
├── tests/              # Sample .drt files for testing
├── server.js           # Express web server
└── package.json        # Node.js dependencies
```

## Recent Changes

**2025-10-03**: Initial Replit setup
- Installed Java and Node.js environments
- Generated ANTLR lexer and parser from grammar files
- Compiled Java source code with all dependencies
- Created Express.js web interface for transpiler
- Configured workflow to run on port 5000
- Disabled graph visualization for headless environment
- Set up file upload and example loading functionality

## How to Use

### Web Interface
1. Visit the application at http://localhost:5000
2. Upload a .drt or .txt file with Flutter-like syntax
3. Or click on example buttons to load sample code
4. Click "Transpile" to convert the code
5. View the result in the Preview tab or see HTML source in the HTML Source tab

### Command Line (Java)
```bash
java -cp "lib/*:bin" App.CompilerApp <input-file.txt>
```

### Development

**Recompile Java code:**
```bash
rm -rf bin && mkdir -p bin
javac -cp "lib/*:src" -d bin $(find src -name "*.java")
```

**Regenerate ANTLR parsers:**
```bash
cd src/grammars
java -jar ../../lib/antlr-4.12.0-complete.jar -o ../antlr -package antlr -visitor DartLexer.g4
java -jar ../../lib/antlr-4.12.0-complete.jar -o ../antlr -package antlr -visitor DartParser.g4
```

**Run the web server:**
```bash
node server.js
```

## Supported Flutter-like Syntax

- **Widgets**: Scaffold, AppBar, Container, Row, Column, Text, Image, Button, TextField, etc.
- **Layouts**: Padding, Center, Expanded
- **Properties**: Colors, fonts, sizes, alignment, borders
- **Control Flow**: If statements, For loops
- **State Management**: getX.set/get, setValue
- **Actions**: onPressed, navigateTo, popUp

## Known Issues

- Graph visualization is disabled in headless mode (not critical for transpilation)
- Video player paths need to be web-accessible URLs

## Contributors

- Alaa Aldeen Zamel
- Mhd Hadi Barakat
- Anas Rish
- Anas Durra
- Sham Tuameh

## License

MIT License
