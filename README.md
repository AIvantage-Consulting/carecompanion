# CareCompanion

AIVantage’s **CareCompanion** is an Android app that helps caregivers and care‐recipients manage recurring tasks and reminders—delivered via notifications, spoken prompts, images, animations, and videos.

> “Your pocket companion for pill reminders, exercise coaching, and daily care tasks.”

## Table of Contents

- [Features](#features)  
- [Architecture](#architecture)  
- [Getting Started](#getting-started)  
  - [Prerequisites](#prerequisites)  
  - [Setup](#setup)  
- [Project Structure](#project-structure)  
- [Requirements & Traceability](#requirements--traceability)  
- [Contributing](#contributing)  
- [License](#license)  
- [Contact](#contact)

---

## Features

- Schedule and snooze reminders via Android notifications  
- Rich task instructions: TTS, images, animations, videos  
- Simultaneous presentation of media and audio  
- Normalized resource store for deduplication and metadata  
- Clean separation of **business-logic**, **data-access**, **infrastructure**, and **UI**  

## Architecture

We follow a **modular, SOLID**-driven clean-slate architecture:

```
business-logic → data-access (Room) → infrastructure (OS adapters, DI) → user-interface (Compose + ViewModels)
```

Each layer depends only on the layer below it.  Read more in our [PRD (v1.4)](docs/AIVantage_CareCompanion_PRD_v1.4.md) and see progress in the [RTM](REQ-TRACEABILITY.md).

---

## Getting Started

### Prerequisites

- JDK 11 or newer  
- Android Studio Flamingo (or later)  
- Android SDK Platform 24 (minSdk 24)  
- Kotlin 1.9.10  
- Internet connection to download Gradle plugins and emulator images

### Setup

1. **Clone the repo**  
   ```bash
   git clone https://github.com/aivantage-consulting/carecompanion.git
   cd carecompanion
   ```

2. **Open in Android Studio**  
   - Select the root folder, let it import the Gradle project.  
   - Create or update your AVD (we recommend a “Pixel” with Google Play at API 25+).  

3. **Build & Run**  
   - Sync Gradle (you should see 4 modules: `:app` plus our 4 feature modules).  
   - Hit **Run** on the `app` module. “Hello Android!” indicates a successful shell.

---

## Project Structure

```
.
├── app/                 # Android Studio “Empty Activity” shell
├── business-logic/      # Domain entities, repository & use-case interfaces
├── data-access/         # Room entities, DAOs, mappers & repository impls
├── infrastructure/      # Composition root, OS adapter implementations
├── user-interface/      # Compose screens, ViewModels, navigation
├── docs/                # PRD v1.4
├── REQ-TRACEABILITY.md  # Requirements Traceability Matrix
├── build.gradle.kts     # Top-level settings
├── settings.gradle.kts  # Module includes
└── gradle.properties    # AndroidX & Jetifier flags
```

---

## Requirements & Traceability

Every PRD item is tracked in **REQ-TRACEABILITY.md**, with links to:

- PRD section (v1.4)  
- Code artifacts  
- Unit & integration tests  
- Status (Not Started / In Progress / Done)

This ensures **end-to-end** coverage from spec → code → test.

---

## Contributing

1. ⭐ Star the repo!  
2. 📝 Create an Issue or PR linked to a PRD ID.  
3. 🔨 Follow the commit message convention:  
   ```
   feat(4.3.1): Persist CareTask
   fix(4.6.2): Snooze action on notification
   chore: bump version to 1.0.0
   ```
4. 🚀 CI will run module-level tests; don’t merge until green.

---

## License

This project is licensed under the **Apache License 2.0**. See [LICENSE](LICENSE) for details.

---

## Contact

**AIVantage Consulting Inc.**  
- Umbrella for CareCompanion development  
- Website: https://aivantage.com  
- Email: Umesh.J.Shah+github-aivantage-consulting-inc@gmail.com  

Feel free to open issues or reach out with questions!  
