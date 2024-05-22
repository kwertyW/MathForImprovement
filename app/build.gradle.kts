plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.mathematicsforimprovement"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mathematicsforimprovement"
        minSdk = 24
        targetSdk = 34
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.navigation:navigation-fragment:2.7.7")
    implementation("androidx.navigation:navigation-ui:2.7.7")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
//    implementation("javax.script.ScriptEngine;")
//    implementation("javax.script.ScriptEngineManager;")
//    implementation("javax.script.ScriptException;")

//    implementation("javax.xml.bind:jaxb-api:2.3.1")
//    implementation("com.sun.xml.bind:jaxb-core:2.3.0.1")
//    implementation("com.sun.xml.bind:jaxb-impl:2.3.2")
//    implementation("javax.activation:activation:1.1.1")
}