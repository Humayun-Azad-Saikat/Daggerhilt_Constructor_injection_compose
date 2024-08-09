// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false

   //for alias id("com.google.dagger.hilt.android") version "2.44" apply false //with this something have to add in libs.versions file:name,id,version
    alias(libs.plugins.google.dagger.hilt) apply false
}