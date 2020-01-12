import com.android.build.gradle.ProguardFiles.getDefaultProguardFile

apply("com.android.application")
apply("kotlin-android")
apply("kotlin-android-extensions")

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.2")

    defaultConfig {
        applicationId = "com.shvants.shtrava"
        minSdkVersion = 21
        targetSdkVersion = 29
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isDebuggable = false
            multiDexEnabled = false
            isMinifyEnabled = true
            proguardFiles("proguard-rules.pro", getDefaultProguardFile("proguard-android-optimize.txt"))
        }

        debug {
            multiDexEnabled = true
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.core:core-ktx:1.1.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")

    testImplementation("junit:junit:4.12")

    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}
