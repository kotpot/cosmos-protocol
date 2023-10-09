import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
    kotlin("plugin.serialization") version "1.9.0"
}

group = "org.kotpot.cosmos"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    api("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:1.6.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        languageVersion = "1.5"
        freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
        jvmTarget = "1.8"
    }
}

tasks.test {
    useJUnitPlatform()
}