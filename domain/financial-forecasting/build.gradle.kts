plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    //testRuntimeOnly("org.junit.platform:junit-platform-launcher")

}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}