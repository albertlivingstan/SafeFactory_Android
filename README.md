# SafeFactory 3D — Industrial Digital Twin & Emergency Navigation

SafeFactory 3D transforms plant safety with an interactive WebGL 3D Digital Twin, dynamic evacuation pathfinding, real-time IoT sensor telemetry, and workforce muster accountability.

Bundled locally for 100% offline-capable execution inside an Android hardware-accelerated WebView.

---

## 🌟 Key Features

### 1. Interactive 3D Digital Twin (Three.js WebGL)
- **Rotatable 360° Industrial Environment:** Realistic 3D factory floor with robotic welding cells, chemical storage tanks, precision CNC stations, gantry cranes, and structural pillars.
- **Dynamic 3D Particle FX:** Animated volumetric flame embers, rising smoke plumes, and expanding red hazard shockwaves.
- **Dynamic 3D Evacuation Vector:** Glowing neon laser escape corridor with animated pulses pointing toward safe exits. Automatically reroutes in real-time around hazard zones.
- **Worker & User Locators:** Stylized 3D personnel with a golden glowing beacon and holographic HUD locator marking your exact position (`YOU · BAY 04`).
- **Interactive Raycasting:** Tap any machine or station in 3D to inspect its live temperature, health percentage, vibration, and diagnostics.
- **Tactical Camera Presets:** Switch between 3D Isometric, 2D Floor Plan, Worker POV, and Hazard Focus angles with smooth interpolation.

### 2. Cyber-Industrial Glassmorphic UI
- **Obsidian & Neon Design Language:** Deep space navy `#060b14` palette with electric cyan, emerald green, tactical amber, and scarlet hazard glows.
- **Interactive Holographic Gyro Core:** 3D animated CSS gyroscopic ring indicating live facility threat level (`SECURE` vs `CRITICAL ALERT`).
- **Real-Time Telemetry & Metric Tiles:** Live temperature, smoke density, VOC gas detectors, and acoustic decibel sensors.
- **Full-Screen 3D Mode:** Maximizes the 3D twin for immersive tactical navigation.

### 3. Procedural Audio & Tactile Haptics
- **Web Audio API Synthesizer:** Built-in procedural alert siren sweeps, UI clicks, reroute frequency sweeps, and muster confirmation chimes — zero external audio files required.
- **Android Tactile Haptics:** Vibration patterns triggered during critical alerts and check-in confirmation.

---

## 📱 Build APK in Android Studio

1. Open `SafeFactory_Android` in **Android Studio** (with Android SDK 35).
2. Allow Gradle to sync dependencies.
3. Select **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
4. Locate the generated APK at:
   `app/build/outputs/apk/debug/app-debug.apk`
5. Install on any Android device running Android 7.0+ (API 24+).
