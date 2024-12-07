plugins {
    kotlin("jvm") apply false
}

group = "ru.otus.otuskotlin.overhellz.rodiond26"
version = "0.0.1"

repositories {
    mavenCentral()
}

subprojects {
    repositories {
        mavenCentral()
    }
    group = rootProject.group
    version = rootProject.version
}
