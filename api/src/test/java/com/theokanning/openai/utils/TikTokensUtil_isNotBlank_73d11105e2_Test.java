// ********RoostGPT********
/*
Test generated by RoostGPT for test java-junit4-test using AI Type Open AI and AI Model gpt-4

1. Scenario: Passing a Non-Blank String
   Given a string "Hello, World!" is passed to the function
   When the function isNotBlank is called
   Then the function should return true.

2. Scenario: Passing a Blank String
   Given a string " " is passed to the function
   When the function isNotBlank is called
   Then the function should return false.

3. Scenario: Passing a Null String
   Given a null is passed to the function
   When the function isNotBlank is called
   Then the function should return false.

4. Scenario: Passing an Empty String
   Given an empty string "" is passed to the function
   When the function isNotBlank is called
   Then the function should return false.

5. Scenario: Passing a String with only white spaces
   Given a string "     " is passed to the function
   When the function isNotBlank is called
   Then the function should return false.

6. Scenario: Passing a String with New Line Characters
   Given a string "\n\n" is passed to the function
   When the function isNotBlank is called
   Then the function should return false.

7. Scenario: Passing a String with Tab Characters
   Given a string "\t\t" is passed to the function
   When the function isNotBlank is called
   Then the function should return false.

8. Scenario: Passing a String with Special Characters
   Given a string "@#$%^&*" is passed to the function
   When the function isNotBlank is called
   Then the function should return true.

9. Scenario: Passing a String with Numeric Characters
   Given a string "123456" is passed to the function
   When the function isNotBlank is called
   Then the function should return true.

10. Scenario: Passing a String with Combination of Blank and Non-Blank Characters
    Given a string " Hello, World! " is passed to the function
    When the function isNotBlank is called
    Then the function should return true.
*/

// ********RoostGPT********
package com.theokanning.openai.utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class TikTokensUtil_isNotBlank_73d11105e2_Test {

    @Test
    public void testIsNotBlank_NonBlankString() {
        assertTrue(TikTokensUtil.isNotBlank("Hello, World!"));
    }

    @Test
    public void testIsNotBlank_BlankString() {
        assertFalse(TikTokensUtil.isNotBlank(" "));
    }

    @Test
    public void testIsNotBlank_NullString() {
        assertFalse(TikTokensUtil.isNotBlank(null));
    }

    @Test
    public void testIsNotBlank_EmptyString() {
        assertFalse(TikTokensUtil.isNotBlank(""));
    }

    @Test
    public void testIsNotBlank_StringWithOnlyWhiteSpaces() {
        assertFalse(TikTokensUtil.isNotBlank("     "));
    }

    @Test
    public void testIsNotBlank_StringWithNewLineCharacters() {
        assertFalse(TikTokensUtil.isNotBlank("\n\n"));
    }

    @Test
    public void testIsNotBlank_StringWithTabCharacters() {
        assertFalse(TikTokensUtil.isNotBlank("\t\t"));
    }

    @Test
    public void testIsNotBlank_StringWithSpecialCharacters() {
        assertTrue(TikTokensUtil.isNotBlank("@#$%^&*"));
    }

    @Test
    public void testIsNotBlank_StringWithNumericCharacters() {
        assertTrue(TikTokensUtil.isNotBlank("123456"));
    }

    @Test
    public void testIsNotBlank_StringWithCombinationOfBlankAndNonBlankCharacters() {
        assertTrue(TikTokensUtil.isNotBlank(" Hello, World! "));
    }
}
