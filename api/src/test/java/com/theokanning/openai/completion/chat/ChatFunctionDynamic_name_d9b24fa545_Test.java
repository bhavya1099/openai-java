// ********RoostGPT********
/*
Test generated by RoostGPT for test java-junit4-test using AI Type Open AI and AI Model gpt-4

1. **Scenario: Null Argument**
   - Test if the function throws an exception when a null argument is passed. Since the argument is marked as `@NonNull`, the function should throw NullPointerException.

2. **Scenario: Empty String Argument**
   - Test if the function accepts an empty string as a valid name. The function may or may not throw an error depending on the business requirements.

3. **Scenario: Valid String Argument**
   - Test if the function correctly sets the name when a valid string is passed as an argument.

4. **Scenario: Spaces in String Argument**
   - Test if the function correctly handles names that contain spaces. Some names may contain spaces and the function should be able to handle such cases.

5. **Scenario: Non-alphanumeric Characters in String Argument**
   - Test if the function correctly handles names that contain non-alphanumeric characters. Depending on the business requirements, such names may or may not be valid.

6. **Scenario: Long String Argument**
   - Test if the function correctly handles names that are very long. There may be a limit on the length of the name and the function should be able to handle such cases.

7. **Scenario: Return Type**
   - Test if the function correctly returns an instance of the Builder class. This is important for method chaining.

8. **Scenario: Unicode Characters in String Argument**
   - Test if the function correctly handles names that contain Unicode characters. Depending on the business requirements, such names may or may not be valid.

9. **Scenario: Check Case Sensitivity**
   - Test if the function treats names with different cases as different names. Depending on the business requirements, the names may be case sensitive or case insensitive.

10. **Scenario: Special Characters in String Argument**
    - Test if the function correctly handles names that contain special characters. Depending on the business requirements, such names may or may not be valid.
*/

// ********RoostGPT********
package com.theokanning.openai.completion.chat;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ChatFunctionDynamic_name_d9b24fa545_Test {
    private Builder builder;
    
    @Before
    public void setUp() {
        builder = new Builder();
    }

    @Test(expected = NullPointerException.class)
    public void testName_NullArgument() {
        builder.name(null);
    }

    @Test
    public void testName_EmptyStringArgument() {
        Builder returnedBuilder = builder.name("");
        assertEquals("", returnedBuilder.getName());
    }

    @Test
    public void testName_ValidStringArgument() {
        Builder returnedBuilder = builder.name("ValidName");
        assertEquals("ValidName", returnedBuilder.getName());
    }

    @Test
    public void testName_SpacesInStringArgument() {
        Builder returnedBuilder = builder.name("Name With Spaces");
        assertEquals("Name With Spaces", returnedBuilder.getName());
    }

    @Test
    public void testName_NonAlphanumericCharactersInStringArgument() {
        Builder returnedBuilder = builder.name("NameWith@NonAlphanumericCharacters");
        assertEquals("NameWith@NonAlphanumericCharacters", returnedBuilder.getName());
    }

    @Test
    public void testName_LongStringArgument() {
        String longName = new String(new char[1000]).replace("\0", "a");
        Builder returnedBuilder = builder.name(longName);
        assertEquals(longName, returnedBuilder.getName());
    }

    @Test
    public void testName_ReturnType() {
        assertTrue(builder.name("TestName") instanceof Builder);
    }

    @Test
    public void testName_UnicodeCharactersInStringArgument() {
        Builder returnedBuilder = builder.name("NameWithÜnicodeCharacters");
        assertEquals("NameWithÜnicodeCharacters", returnedBuilder.getName());
    }

    @Test
    public void testName_CheckCaseSensitivity() {
        Builder returnedBuilder = builder.name("TestName");
        assertNotEquals("testname", returnedBuilder.getName());
    }

    @Test
    public void testName_SpecialCharactersInStringArgument() {
        Builder returnedBuilder = builder.name("NameWith!@#$%^&*()SpecialCharacters");
        assertEquals("NameWith!@#$%^&*()SpecialCharacters", returnedBuilder.getName());
    }
}
