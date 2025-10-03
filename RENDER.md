Deploying to Render

This project contains both a Node.js frontend (Express) and a Java-based transpiler (compiled classes + lib/* JARs). You can deploy it to Render using either the Docker image (recommended) or Render's Node Web Service. Docker is recommended because the app requires a JDK and ANTLR tooling which are included in the provided Dockerfile.

Option A — Deploy as a Docker Web Service (recommended)

1. In Render dashboard, create a new "Web Service".
2. Choose "Docker" as the Environment.
3. Connect your repository and set the root to the repository root (where `Dockerfile` lives).
4. Build & start: Render will build using the `Dockerfile` already present in the repo. The Dockerfile installs OpenJDK and builds Java classes, installs Node dependencies, and runs `node server.js` on port 5000. Render sets the `PORT` environment variable; the server uses that automatically.
5. (Optional) In Render's Environment settings, set any needed env vars (none required by default). If you want a specific Node version, set `NODE_VERSION` or edit the Dockerfile.

Option B — Deploy as a Node Web Service (limited)

This only works if you pre-compile Java classes and ensure all native build steps are done during CI or in the repository (or you vendor compiled `bin/` and `lib/`). If you prefer this:

1. Ensure `bin/` and `lib/` are committed to the repo (compiled classes and required JARs).
2. In Render, create a new "Web Service" and choose "Node".
3. Set the start command to: `npm start` (or `node server.js`).
4. Render will run `npm install` on build and then `npm start` at runtime. The Express server listens on `process.env.PORT`.

Notes and Gotchas

- The Java transpiler is invoked by the Node server with:
  java -cp "lib/*:bin" App.CompilerApp <input-file>
  So `lib/` must contain the jars and `bin/` the compiled classes.

- If you want Render to build the Java code during deployment without Docker, you'll need to add build steps in a build script or Render's build commands to install `openjdk` and run `javac`. This is more fragile; prefer Docker.

- Make sure `uploads/` and `output/` are writable at runtime. Render's web services run with ephemeral filesystems — outputs are transient. If you need persistent storage, connect an S3-compatible bucket and update the server to write/read from it.

- Port: Render will set `PORT`. The app uses `process.env.PORT || 5000` so it's compatible.

Troubleshooting

- If the server fails to start on Render, check the Deploy logs. Common issues:
  - Missing `bin/` or `lib/` when not using Docker.
  - Java not installed in the runtime (use Docker).
  - Permissions on `uploads/` / `output/`.

- To test locally (recommended) use the Dockerfile:

```bash
# build and run locally
docker build -t transpiler .
docker run -p 5000:5000 transpiler
```

Summary

- Recommended: Deploy using the provided `Dockerfile` (Render Docker Web Service).
- Alternate: commit `bin/` and `lib/` and deploy as Node Web Service (set `npm start`).

If you want, I can:
- Add a Render-specific `render.yaml` manifest to preconfigure the service in your repo.
- Add a small health-check endpoint (e.g. `/health`) and a minimal unit test to validate server start.
