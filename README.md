
# Astra — Flutter-like to HTML/JS Transpiler

Astra is a Java-based transpiler that converts a compact, Flutter-inspired UI language into production-ready HTML and minimal JavaScript. This repo bundles a Java transpiler, ANTLR grammars, a small Node/Express preview server, curated example files, and a Docker/Render-friendly configuration to run the service as one deployable unit.

This README is written for inclusion in a portfolio: it explains what the project does, how to run it locally, how to deploy it, and how to contribute or extend the language.

---

Table of contents
- What is Astra?
- Quick demo
- Features
- Repo layout
- Installation (local)
- Build & run
- Examples
- Deployment (Docker & Render)
- Extending the grammar
- Contributing
- Troubleshooting
- Credits & License

## What is Astra?

Astra provides a small, designer-friendly language (a subset similar to Flutter's widget structure) and a transpiler that converts that language into responsive HTML and small JS snippets for interactions. It is an educational but practical project: it demonstrates compiler construction techniques (lexer, parser, AST, visitors) while producing usable web outputs.

## Quick demo

- Edit an example input in `tests/` (e.g. `tests/PortfolioSimple` or the other `.txt` examples).
- Compile & run the transpiler to generate HTML in `output/`.
- Start the Node preview server (`npm start`) and open the UI to load examples.

See the `tests/` directory for ready-to-run example `.drt` files used in demos.

## Features

- ANTLR4-based lexer & parser with clear syntax and semantic error messages.
- Java visitors that transform the parse tree into an AST and generate HTML + JS.
- Small Node/Express preview server to upload or paste `.drt` source and get back generated HTML.
- Curated example inputs that strictly follow the grammar (no parser errors).
- Docker multi-stage build for reproducible builds and compact runtime images.

## Repo layout

- `src/` — Java source code (ANTLR visitors, transpiler logic, `App.CompilerApp`).
- `src/grammars/` — ANTLR lexer & parser definitions (`DartLexer.g4`, `DartParser.g4`).
- `lib/` — third-party JARs required by the Java runtime (committed).
- `bin/` — compiled classes (generated during local build; ignored by git).
- `tests/` — curated example inputs (.drt / .txt files) used for demos.
- `output/` — generated HTML (ignored by git).
- `server.js` — Express preview server.
- `Dockerfile`, `render.yaml`, `RENDER.md` — deployment artifacts and guidance.

## Installation (local)

Prerequisites
- Java 17+ (for `javac` and runtime)
- Node 18+ and `npm`

Install Node dependencies (for the preview server):

```bash
npm install
```

Compile Java sources (this produces `bin/`):

```bash
mkdir -p bin
javac --release 17 -cp "lib/*:src" -d bin $(find src -name "*.java")
```

Run a transpiler pass on an example (generates `output/<name>.html`):

```bash
java -cp "lib/*:bin" App.CompilerApp tests/PortfolioSimple
# or
java -cp "lib/*:bin" App.CompilerApp tests/container.txt
```

Start the preview server (serves UI on port 5000 by default):

```bash
npm start
# open http://localhost:5000
```

Tip: the server uses `process.env.PORT` so it will work on Render / Heroku-style hosts.

## Examples

Curated examples live in `tests/`. A few highlights:
- `tests/PortfolioSimple` — a compact company portfolio layout (no hero section).
- `tests/form.txt` — contact form demo.
- `tests/container.txt` — product showcase example.

These examples are intentionally strict so they parse with the current grammar. When editing examples:
- avoid `//` comments (lexer doesn't support them)
- use `#HEX` for colors
- prefer the grammar tokens/keywords defined in `src/grammars/DartLexer.g4`

## Deployment (Docker & Render)

Docker
- Build locally:

```bash
docker build -t astra-transpiler:latest .
```
- Run:

```bash
docker run -p 5000:5000 astra-transpiler:latest
```

The provided `Dockerfile` is multi-stage. A JDK image compiles Java/ANTLR artifacts and a slim Node runtime image hosts the preview server with a matching JRE.

Render
- See `RENDER.md` and `render.yaml` in the repo. The `render.yaml` is a minimal manifest that creates a Web Service on Render configured to build the Dockerfile and expose the app.

## Extending the grammar

To add new widgets or properties:

1. Update `src/grammars/DartLexer.g4` and `src/grammars/DartParser.g4`.
2. Regenerate ANTLR artifacts (or compile against existing `lib/antlr-4.12.0-complete.jar`).
3. Update or add visitor methods in `src/visitors/` to produce AST nodes and HTML output.
4. Recompile Java and run tests against `tests/` examples.

If you'd like help adding a widget, open an issue describing the syntax and desired HTML output.

## Contributing

Contributions are welcome. Suggested workflow:

1. Fork this repository.
2. Create a feature branch: `git checkout -b feat/add-widget`.
3. Update grammar + visitor code and add tests/examples under `tests/`.
4. Compile and run the transpiler locally to ensure examples parse.
5. Open a Pull Request describing the change, the grammar updates, and sample input/output.

Please include tests/examples demonstrating the new or changed behavior.

## Troubleshooting

- "java: not found" — ensure your runtime has Java installed. The Dockerfile installs a JRE in the final image. Locally, install Java 17+.
- Parsing errors — check the token and rule definitions in `src/grammars/`. Common causes: stray `//` comments, using `textColor` inside `Text` (not supported), or missing commas/parentheses.
- If you see class version errors (UnsupportedClassVersionError), compile with `--release 17` to match the runtime JRE.

## Credits & Authors

- Lead developer: Alaa Aldeen Zamel (maintainer)
- Original contributors: Mhd Hadi Barakat, Anas Rish, Anas Durra, Sham Tuameh

If you include this project in your portfolio and want a short author blurb or role description added, tell me your preferred text and I'll add it under an "About the author" section.

## License

This project is licensed under the MIT License — see `LICENSE` for details.

---

If you want, I can: commit and push these README changes for you, add an "About the author" paragraph, or create a short screenshot of `output/PortfolioSimple.html` to embed in the README.
