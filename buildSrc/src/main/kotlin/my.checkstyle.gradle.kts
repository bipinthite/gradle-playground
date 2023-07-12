plugins {
  id("checkstyle")
}

val checkstyleVersion = "8.41.1"
val checkstyleConfig: Configuration by configurations.creating

dependencies {
  checkstyleConfig("com.puppycrawl.tools:checkstyle:$checkstyleVersion") {
    isTransitive = false
  }
}

checkstyle {
  toolVersion = checkstyleVersion
  isShowViolations = true
  config = resources.text.fromArchiveEntry(checkstyleConfig, "google_checks.xml")
}
