# Deployment Guide

## Quick Start Options

### Option 1: Docker (Recommended)

Build and run with a single command:

```bash
docker build -t transpiler . && docker run -p 5000:5000 transpiler
```

Or use docker-compose:

```bash
docker-compose up
```

### Option 2: Docker Compose

```bash
docker-compose up -d
```

To stop:

```bash
docker-compose down
```

### Option 3: Startup Script

Simply run:

```bash
./start.sh
```

This script will:
- Generate ANTLR parsers if needed
- Compile Java code if needed
- Install Node.js dependencies if needed
- Start the server

### Option 4: Manual Setup

If you prefer to run each step manually:

```bash
# Generate ANTLR parsers
cd src/grammars
java -jar ../../lib/antlr-4.12.0-complete.jar -o ../antlr -package antlr -visitor DartLexer.g4
java -jar ../../lib/antlr-4.12.0-complete.jar -o ../antlr -package antlr -visitor DartParser.g4
cd ../..

# Compile Java code
mkdir -p bin
javac -cp "lib/*:src" -d bin $(find src -name "*.java")

# Install Node.js dependencies
npm install

# Start the server
node server.js
```

## Access

Once running, access the transpiler at:
- Local: http://localhost:5000
- Replit: Your Replit URL

## Requirements

### Docker Option
- Docker 20.10+
- Docker Compose 1.29+ (optional)

### Manual Option
- Java 19+
- Node.js 18+
- npm

## Production Deployment

For production, use the Docker option with:

```bash
docker build -t transpiler:production .
docker run -d -p 5000:5000 --restart unless-stopped transpiler:production
```

Or deploy using Replit's built-in deployment feature.
