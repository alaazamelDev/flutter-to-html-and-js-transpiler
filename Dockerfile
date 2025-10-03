# Multi-stage build for Flutter-like to HTML Transpiler
FROM node:20-slim AS base

# Install Java (OpenJDK 19)
RUN apt-get update && \
    apt-get install -y openjdk-19-jdk && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

WORKDIR /app

# Copy library dependencies
COPY lib ./lib

# Copy source files
COPY src ./src

# Copy grammar files and generate ANTLR parsers
RUN cd src/grammars && \
    java -jar ../../lib/antlr-4.12.0-complete.jar -o ../antlr -package antlr -visitor DartLexer.g4 && \
    java -jar ../../lib/antlr-4.12.0-complete.jar -o ../antlr -package antlr -visitor DartParser.g4

# Compile Java source code
RUN mkdir -p bin && \
    javac -cp "lib/*:src" -d bin $(find src -name "*.java")

# Copy Node.js application files
COPY package*.json ./
COPY server.js ./
COPY public ./public
COPY tests ./tests

# Install Node.js dependencies
RUN npm install --production

# Create necessary directories
RUN mkdir -p uploads output

# Expose port
EXPOSE 5000

# Set environment variables
ENV NODE_ENV=production

# Start the server
CMD ["node", "server.js"]
