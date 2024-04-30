plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    implementation("io.ktor:ktor-client-core:2.3.10")
    implementation("io.ktor:ktor-client-cio:2.3.10") // (или ktor-client-okhttp для использования OkHttp)
    implementation("io.ktor:ktor-client-serialization:2.3.10")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}