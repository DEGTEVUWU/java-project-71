plugins {
    id("java")
    application
    checkstyle
}


group = "hexlet.code"
version = "1.0-SNAPSHOT"
application { mainClass.set("hexlet.code.App") }

repositories {
    mavenCentral()
}
dependencies {
    implementation ("info.picocli:picocli:4.7.5")
    implementation ("com.fasterxml.jackson.core:jackson-databind:2.16.0")
    implementation ("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.16.0")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}