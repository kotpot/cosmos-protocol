plugins {
    kotlin("jvm")
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