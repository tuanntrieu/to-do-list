plugins {
    alias(libs.plugins.android.application)
    id("io.freefair.lombok") version "6.4.1" apply false // Thêm Lombok plugin
}

android {
    namespace = "com.example.nhom10"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.nhom10"
        minSdk = 26
        //noinspection ExpiredTargetSdkVersion
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Thêm Lombok dependencies
    implementation("org.projectlombok:lombok:1.18.20") // Thêm Lombok dependency
    annotationProcessor("org.projectlombok:lombok:1.18.20") // Thêm Lombok annotation processor
    implementation(kotlin("script-runtime"))
}
