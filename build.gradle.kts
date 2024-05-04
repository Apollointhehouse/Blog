val kotlinxHtml: String by project

plugins {
    kotlin("jvm") version "1.9.22"
}

group = "io.github.apollointhehouse"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:$kotlinxHtml")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}