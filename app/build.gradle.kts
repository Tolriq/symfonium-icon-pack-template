plugins {
    id("com.android.application")
}

android {
    namespace = "app.symfonium.iconpack.materialsymbols"
    compileSdk = 36

    defaultConfig {
        applicationId = "app.symfonium.iconpack.materialsymbols"
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "1.0.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

