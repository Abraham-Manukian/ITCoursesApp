// data/build.gradle.kts

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.data" // Задайте пространство имен, соответствующее вашему проекту
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
    implementation(project(":core")) // Зависимость от модуля core, если в нем общие компоненты

    // Retrofit для работы с API
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Room для локального хранилища данных (необязательно, если оно будет нужно)
    implementation("androidx.room:room-runtime:2.3.0")
    kapt("androidx.room:room-compiler:2.3.0")

    // Опционально для работы с Kotlin Coroutines и упрощения работы с потоками данных
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.3")
}
