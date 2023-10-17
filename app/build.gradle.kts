import org.jetbrains.kotlin.kapt3.base.Kapt.kapt
import org.jetbrains.kotlin.storage.CacheResetOnProcessCanceled.enabled

plugins {
  //  kotlin("android") version "1.5.21" // Use the correct version
   // kotlin("kapt") version "1.5.21" // Use the correct version
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("androidx.navigation.safeargs")
    //id ("dagger.hilt.android.plugin")
    id ("kotlin-kapt")


}


android {
    namespace = "com.bis.epay"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.bis.Expence"
        minSdk = 26
        targetSdk = 33
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

   /* kotlinOptions {
        jvmTarget = "1.8"
    }*/

    buildFeatures {

        viewBinding = true

    }

    /*dataBinding {
        //noinspection DataBindingWithoutKapt
        enabled = true
    }*/
}

dependencies {

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.databinding:databinding-runtime:8.1.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    val lifecycle_version = "2.6.1"

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    //https://square.github.io/retrofit/
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")


    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")



    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

// define any required OkHttp artifacts without version
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")
    //Room
    /*val room_version = "2.5.2"

    implementation("androidx.room:room-runtime:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")
*/
   /* implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")*/

    // Kotlin navigation
    val nav_version = "2.7.1"
    implementation ("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation ("androidx.navigation:navigation-ui-ktx:$nav_version")
    implementation ("androidx.navigation:navigation-common:$nav_version")
    androidTestImplementation ("androidx.navigation:navigation-testing:$nav_version")


    implementation ("de.hdodenhof:circleimageview:3.1.0")
    }

// Allow references to generated code
/*
kapt {
    correctErrorTypes = true
}*/
