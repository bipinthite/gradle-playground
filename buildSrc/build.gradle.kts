plugins {
  `kotlin-dsl`
}

repositories {
  mavenCentral()
  gradlePluginPortal()
}

dependencies {
  implementation("com.github.spotbugs.snom:spotbugs-gradle-plugin:5.0.14")
}
