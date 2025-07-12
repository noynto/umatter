plugins {
    id("application")
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "me.noynto.umatter.bootstrap.Main"
}