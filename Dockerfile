# Builder stage: compile Java with a proper JDK image
FROM eclipse-temurin:19-jdk AS builder
WORKDIR /build

# Copy library dependencies and source
COPY lib ./lib
COPY src ./src

# Generate ANTLR parsers (requires the antlr jar in lib)
RUN cd src/grammars && \
    java -jar ../../lib/antlr-4.12.0-complete.jar -o ../antlr -package antlr -visitor DartLexer.g4 && \
    java -jar ../../lib/antlr-4.12.0-complete.jar -o ../antlr -package antlr -visitor DartParser.g4

# Compile Java source into bin/
RUN mkdir -p bin && \
    javac -cp "lib/*:src" -d bin $(find src -name "*.java")


# Final image: lightweight Node runtime
FROM node:20-slim
WORKDIR /app

# Copy compiled Java classes and libraries from builder
COPY --from=builder /build/bin ./bin
COPY --from=builder /build/lib ./lib

# Copy Node app files
COPY package*.json ./
COPY server.js ./
COPY public ./public
COPY tests ./tests

# Install Node.js dependencies (production)
RUN npm install --production

# Create runtime directories
RUN mkdir -p uploads output

# Expose port
EXPOSE 5000

ENV NODE_ENV=production

CMD ["node", "server.js"]
