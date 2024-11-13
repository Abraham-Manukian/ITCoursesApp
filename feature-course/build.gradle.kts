// feature-course/build.gradle.kts

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.feature_course"
    compileSdk = 30

    defaultConfig {
        minSdk = 23
        //noinspection ExpiredTargetSdkVersion
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
    implementation(project(":core")) // Подключение core-модуля для общих зависимостей
    implementation(project(":data")) // Подключение data-модуля для работы с данными курсов

    // Glide для загрузки изображений (например, иконки курсов)
    implementation("com.github.bumptech.glide:glide:4.11.0")
    kapt("com.github.bumptech.glide:compiler:4.11.0")

    // Jetpack ViewModel и LiveData, если используете их для работы с UI
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")

    // Опционально, зависимости для работы с Compose, если интерфейс будет на Compose
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")
}
