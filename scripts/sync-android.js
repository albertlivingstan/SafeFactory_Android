import fs from 'fs';
import path from 'path';

const rootDir = process.cwd();
const androidAssets = path.join(rootDir, 'app', 'src', 'main', 'assets');

try {
  if (fs.existsSync(androidAssets)) {
    // Copy root index.html to Android assets
    fs.copyFileSync(
      path.join(rootDir, 'index.html'),
      path.join(androidAssets, 'index.html')
    );
    console.log('✓ Successfully synchronized index.html to app/src/main/assets/');
  }
} catch (err) {
  console.warn('Note: Could not sync to Android assets directory:', err.message);
}
