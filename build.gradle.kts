android {
    namespace = "com.example.student_manager"
    compileSdk = 35
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.androidx.navigation.safeargs.kotlin) // Sử dụng alias nếu đã khai báo trong `libs.versions.toml`
}




