// Top-level build file where you can add configuration options common to all sub-projects/modules.

allprojects {
    apply {
        plugin("dev.nx.gradle.project-graph")
    }
}

plugins {
    id("dev.nx.gradle.project-graph") version("0.1.7")
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.android.multiplatform.library) apply false
    alias(libs.plugins.android.lint) apply false
}