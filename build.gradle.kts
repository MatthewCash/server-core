plugins {
    java
}

repositories {
    maven { url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/") }
    maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots") }
    mavenCentral()
}

dependencies {
    implementation("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
}

group = "com.matthewcash.network"
version = "1.0.0"
description = "Matthew_Cash Server Core"
java.sourceCompatibility = JavaVersion.VERSION_1_8
