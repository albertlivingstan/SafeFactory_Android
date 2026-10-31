# SafeFactory 3D — Industrial Digital Twin & Emergency Command Center

SafeFactory 3D is a responsive, hardware-accelerated 3D Web Application and Android App designed for industrial emergency management, real-time digital twin monitoring, and workforce evacuation accountability.

Built with **Vite** for zero-latency local development and instant deployment to **Vercel**, while maintaining full offline Android APK support.

---

## 🚀 Instant Deployment on Vercel

1. Go to [vercel.com](https://vercel.com) and click **"Add New Project"**.
2. Import your GitHub repository: [`albertlivingstan/SafeFactory_Android`](https://github.com/albertlivingstan/SafeFactory_Android).
3. Vercel automatically detects the **Vite** framework preset:
   - **Build Command:** `npm run build`
   - **Output Directory:** `dist`
4. Click **Deploy**! Your 3D Web App will be live with free global CDN and SSL.

---

## 💻 Local Development with Vite

1. **Install dependencies:**
   ```bash
   npm install
   ```
2. **Start the local Vite dev server:**
   ```bash
   npm run dev
   ```
   Open **[http://localhost:8080](http://localhost:8080)** with instant Hot Module Replacement (HMR).

3. **Build for production:**
   ```bash
   npm run build
   ```
   Outputs the optimized static bundle to `dist/` and automatically synchronizes with the Android assets.

---

## 🌟 Key Features

### 1. 🕹️ Dual Control Schemes (Laptop & Android)
- **Laptop / Desktop Keyboard Controls:**
  - `W` / `↑` : Walk Forward
  - `S` / `↓` : Walk Backward
  - `A` / `←` : Turn Left
  - `D` / `→` : Turn Right
  - `Shift` : Sprint / Run
  - Visual on-screen glowing `[W][A][S][D]` HUD indicator.
- **Android / Mobile Touch Bar:**
  - On-screen touch D-pad (`▲`, `◀`, `▼`, `▶`) and `⚡ RUN` toggle button for thumb control on mobile devices.
  - One-finger drag to rotate camera, two-finger pinch to zoom.

### 2. 📝 Person Reporting & Field Incident Hub
- **Submit Field Incident Reports:**
  - Report fire flare-ups, chemical spills, blocked evacuation corridors, or medical emergencies.
  - `📍 Pin My Location` button captures your avatar's exact 3D coordinates.
  - Spawns a glowing 3D beacon directly on the factory floor and alerts SCADA.
- **Coworker Status Tracking:**
  - Individual roster of on-site workers (*Marco, Elena, Kenji, Sarah, David, Aisha, Maya, Carlos*).
  - One-click buttons to report colleagues as `Safe`, `Injured`, or `Missing`.
  - Recalculates muster headcount and dispatches medical alerts.

### 3. 🌐 Interactive 3D Digital Twin (Three.js WebGL)
- **3D Factory Floor:** Robotic welding cells with articulating arms, chemical silos with liquid sight-tubes, CNC machining centers, overhead gantry cranes, and safety exit portals.
- **Dynamic Particle Effects:** 350+ flame particles with rising smoke plume and expanding red hazard shockwaves.
- **Dynamic AI Evacuation Rerouting:** Automatically detects blocked corridors and reroutes pathways to safe exits (**Exit B**).
- **Articulated 3D Human Avatars:** Running kinematics with swinging limbs, natural torso bobbing, hardhats, and panic emotion markers.

### 4. 🔊 Procedural Synthesizer & Tactile Haptics
- **Procedural Web Audio API:** Modulated evacuation sirens, footstep audio synchronization, emergency dispatch radio chirps, and realistic heartbeat monitor (`lub-dub`) — 100% offline with zero external audio assets.
- **Haptic Vibration:** Tactile vibration sequences for critical alerts and check-in confirmation.

---

## 📱 Building the Android APK

1. Open `SafeFactory_Android` in **Android Studio** (API 35 SDK).
2. Allow Gradle to sync.
3. Select **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
4. Generated APK location: `app/build/outputs/apk/debug/app-debug.apk`.
