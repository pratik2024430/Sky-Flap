// Root build.gradle.kts
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22")
    }
}

allprojects {
    extra.set("gdxVersion", "1.12.1")
    extra.set("kotlinVersion", "1.9.22")
    extra.set("coroutinesVersion", "1.7.3")
    extra.set("junitVersion", "5.10.0")
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
