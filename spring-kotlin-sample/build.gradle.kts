import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    val kotlinVersion = "1.3.10"
    val springBootVersion = "2.1.0.RELEASE"

    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}")
        classpath("org.jetbrains.kotlin:kotlin-allopen:${kotlinVersion}")
    }
}

plugins {
    kotlin("jvm")
}

apply(plugin = "org.jetbrains.kotlin.plugin.spring")
apply(plugin = "org.springframework.boot")
apply(plugin = "io.spring.dependency-management")

group = "jp.john.satoh"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

dependencies {
    compile("org.springframework.boot:spring-boot-starter-actuator")
    compile("org.springframework.boot:spring-boot-starter-web")
    compile("com.fasterxml.jackson.module:jackson-module-kotlin")
    compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    compile("org.jetbrains.kotlin:kotlin-reflect")
    runtimeOnly("com.h2database:h2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
