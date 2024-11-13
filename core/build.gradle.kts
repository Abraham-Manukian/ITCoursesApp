// core/build.gradle.kts

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.core"
    compileSdk = 30

    defaultConfig {
        minSdk = 23
        targetSdk = 30
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.3")

    // Dependency Injection (например, Dagger)
    implementation("com.google.dagger:dagger:2.35")
    kapt("com.google.dagger:dagger-compiler:2.35")

    // ViewModel и LiveData
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")
}
