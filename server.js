const express = require('express');
const multer = require('multer');
const cors = require('cors');
const { exec } = require('child_process');
const fs = require('fs');
const path = require('path');

const app = express();
const PORT = 5000;

app.use(cors());
app.use(express.json());
app.use(express.static('public'));
app.use('/output', express.static('output'));

const storage = multer.diskStorage({
  destination: (req, file, cb) => {
    const uploadDir = 'uploads';
    if (!fs.existsSync(uploadDir)) {
      fs.mkdirSync(uploadDir, { recursive: true });
    }
    cb(null, uploadDir);
  },
  filename: (req, file, cb) => {
    cb(null, Date.now() + '-' + file.originalname);
  }
});

const upload = multer({ storage: storage });

app.get('/', (req, res) => {
  res.sendFile(__dirname + '/public/index.html');
});

app.post('/transpile', upload.single('file'), (req, res) => {
  if (!req.file) {
    return res.status(400).json({ error: 'No file uploaded' });
  }

  const inputFile = req.file.path;
  const command = `java -cp "lib/*:bin" App.CompilerApp ${inputFile}`;

  exec(command, (error, stdout, stderr) => {
    fs.unlinkSync(inputFile);

    if (error) {
      console.error('Error:', stderr);
      return res.status(500).json({ 
        error: 'Transpilation failed', 
        details: stderr || error.message 
      });
    }

    const outputMatch = stdout.match(/Successfully wrote to file (output\/[^\s]+\.html)/);
    if (outputMatch) {
      const outputFile = outputMatch[1];
      const htmlContent = fs.readFileSync(outputFile, 'utf8');
      res.json({ 
        success: true, 
        output: htmlContent,
        outputFile: outputFile,
        message: 'Code Compiled Successfully!'
      });
    } else {
      res.status(500).json({ 
        error: 'Failed to generate output',
        details: stdout 
      });
    }
  });
});

app.get('/examples', (req, res) => {
  const testsDir = 'tests';
  const files = fs.readdirSync(testsDir)
    .filter(file => file.endsWith('.txt'))
    .map(file => ({
      name: file,
      path: path.join(testsDir, file)
    }));
  res.json(files);
});

app.get('/example/:filename', (req, res) => {
  const filename = req.params.filename;
  const filePath = path.join('tests', filename);
  
  if (fs.existsSync(filePath)) {
    const content = fs.readFileSync(filePath, 'utf8');
    res.json({ content });
  } else {
    res.status(404).json({ error: 'File not found' });
  }
});

app.listen(PORT, '0.0.0.0', () => {
  console.log(`Flutter-like to HTML Transpiler running on http://0.0.0.0:${PORT}`);
});
