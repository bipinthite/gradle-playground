plugins {
  id("pmd")
}

pmd {
  isConsoleOutput = true
  rulesMinimumPriority.set(5)
  ruleSets = listOf(
      "category/java/errorprone.xml",
      "category/java/bestpractices.xml",
      "category/java/performance.xml")
}
