plugins {
    id 'org.jetbrains.kotlin.jvm' version '2.0.0'
}

group = 'dev.matytyma'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'org.jetbrains.kotlin:kotlin-test'
}

test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}