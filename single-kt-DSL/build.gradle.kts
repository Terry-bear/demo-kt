import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    //id("java")
    java
    //id("org.jetbrains.kotlin.jvm") version "1.3.61"
    kotlin("jvm") version "1.3.61"
}

group = "com.terryzh.demo-kt"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    maven("https://maven.aliyun.com/repository/central")
}

dependencies {
//    implementation( "org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//    implementation( "org.jetbrains.kotlin:kotlin-reflect")
//    implementation( "com.google.code.gson:gson:2.8.1")
//    testCompile(group= "junit", name= "junit", version= "4.12")
}

val compileKotlin: KotlinCompile by tasks

compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

val compileTestKotlin: KotlinCompile by tasks

compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
//https://kotlinlang.org/docs/reference/using-gradle.html