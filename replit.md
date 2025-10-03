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

**2025-10-03**: Production-ready demo with modern UI
- Complete UI redesign with dark theme (#0E1116) and neo-mint accents (#00C9A7)
- Added live working example in hero section (auto-transpiled login screen)
- Implemented auto-transpile functionality when examples are loaded
- Enhanced server to accept code directly via JSON (no file upload required)
- Added Docker support for single-command deployment
- Created docker-compose.yml for easy orchestration
- Added startup script (start.sh) for quick local development
- Improved typography with Inter and JetBrains Mono fonts
- Added glassmorphism effects and modern animations
- Compiled Java source code with all dependencies
- Configured workflow to run on port 5000
- Disabled graph visualization for headless environment

## How to Use

### Web Interface
1. Visit the application at your Replit URL or http://localhost:5000
2. See the live example in the hero section (auto-transpiled login screen)
3. Click "Try it Now" to scroll to the editor
4. Load an example by clicking example buttons (auto-transpiles immediately)
5. Or upload a .drt or .txt file with Flutter-like syntax
6. Or paste code directly into the editor and click "Transpile"
7. View the result in the Preview tab or see HTML source in the HTML Source tab

### Docker Deployment

**Quick start:**
```bash
docker-compose up
```

Or build and run manually:
```bash
docker build -t transpiler . && docker run -p 5000:5000 transpiler
```

**Single script startup:**
```bash
./start.sh
```

See DEPLOYMENT.md for more deployment options.

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
