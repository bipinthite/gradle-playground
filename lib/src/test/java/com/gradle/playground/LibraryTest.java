/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package com.gradle.playground;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LibraryTest {
  @Test
  void someLibraryMethodReturnsTrue() {
    Library classUnderTest = new Library();
    assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
  }
}
