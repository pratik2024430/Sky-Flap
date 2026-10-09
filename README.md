# Sky Flap: Aero Surge

A commercial-grade, 2D endless arcade Android game built with **Kotlin** and **LibGDX**.

## 🔒 Security & Secret Safety Guidelines

> [!CAUTION]
> **CRITICAL SECRET ROTATION WARNING**: If any secret key, API token, or database URL was ever hardcoded in an earlier commit or development draft, **rotate that secret immediately** in your service provider dashboards (e.g. Google Cloud Console, AdMob, Supabase, Stripe, Firebase). Git commit history persists all past string values.

### Secret Management Rules
1. **Environment Variables Injection**: All client-side IDs (AdMob Unit IDs, Backend API URLs, Local Checksum Salts) are loaded dynamically from environment variables via `ConfigProvider` and `SecretProvider`.
2. **Client vs Server Security Boundaries**:
   - **Allowed Client-Side**: AdMob App & Unit IDs, Supabase Public Anon Key (**ONLY WITH ROW LEVEL SECURITY (RLS) ENABLED ON ALL TABLES**), Stripe Publishable Key (`pk_test_...` / `pk_live_...`).
   - **STRICTLY SERVER-SIDE ONLY (NEVER PUT IN MOBILE APK CODE)**:
     - Stripe Secret Key (`sk_live_...`)
     - Supabase Service Role Key (`service_role`)
     - Database Connection Strings (PostgreSQL, MongoDB, Redis)
     - Firebase Admin SDK Service Account JSONs
     - OAuth Client Secrets & JWT Signing Secrets
     - OpenAI, Gemini, SendGrid, Twilio, or AWS Access Keys
3. **Local Environment Setup**:
   - Copy `.env.example` to `.env` locally.
   - Populate `.env` with your development keys.
   - Ensure `.env` is listed in `.gitignore` and never committed to version control.

---

## Key Features & Architecture
- **Graphics Engine**: 100% original HD procedural vector graphics, multi-layer parallax backdrop, dynamic particles, soft shadows, cyan rim outline shader, and 60 FPS physics loop.
- **Monetization Architecture**: Production interfaces for AdMob (Banner, Interstitial, Rewarded, App Open Ads) with Remote Config interval tuning, and Google Play Billing (IAP skins & remove ads).
- **Live Events & Daily Rewards**: 7-day reward streak calendar, 3 daily quests, and Remote Config seasonal events (Cyberpunk, Halloween, Winter, Summer).
- **Data-Driven Skin Catalog**: Extensible skin repository with rarity tiers, custom trail effects, and coin/achievement unlocks.
- **Multi-Language & Accessibility**: 6-language i18n localization (EN, HI, ES, JA, DE, FR), colorblind palette modes (Deuteranopia, Protanopia, Tritanopia), left-handed mode, and reduced motion settings.
- **Security & Privacy**: SHA-256 HMAC score checksums, AES encrypted saves, GDPR consent review, and COPPA settings.
- **Engineering**: Clean Architecture (Domain UseCases, Repositories, AppContainer DI), JUnit 5 unit tests, and GitHub Actions CI/CD.

## Opening in Android Studio
1. Open Android Studio.
2. Select **Open an existing project** and choose the `Bird flap` directory.
3. Allow Gradle to sync dependencies.
4. Select `android` target configuration and run on your emulator or physical Android device.

## Command Line Build & Verification
- **Run Unit Tests**:
  ```bash
  ./gradlew :core:test
  ```
- **Build Core Module**:
  ```bash
  ./gradlew :core:build
  ```
- **Assemble Android Debug APK**:
  ```bash
  ./gradlew :android:assembleDebug
  ```
