// ********RoostGPT********
/*
Test generated by RoostGPT for test java-junit4-test using AI Type Open AI and AI Model gpt-4

1. Scenario: Check if the build function correctly assigns the "name" attribute to the ChatFunction object.
   Test Steps: 
   - Create an instance of the class where the build function resides.
   - Set the "name" attribute.
   - Invoke the build function.
   - Check if the resulting ChatFunction object's name attribute is correctly set.

2. Scenario: Check if the build function correctly assigns the "description" attribute to the ChatFunction object.
   Test Steps: 
   - Create an instance of the class where the build function resides.
   - Set the "description" attribute.
   - Invoke the build function.
   - Check if the resulting ChatFunction object's description attribute is correctly set.

3. Scenario: Check if the build function correctly assigns the "parametersClass" attribute to the ChatFunction object.
   Test Steps: 
   - Create an instance of the class where the build function resides.
   - Set the "parametersClass" attribute.
   - Invoke the build function.
   - Check if the resulting ChatFunction object's parametersClass attribute is correctly set.

4. Scenario: Check if the build function correctly assigns the "executor" attribute to the ChatFunction object.
   Test Steps: 
   - Create an instance of the class where the build function resides.
   - Set the "executor" attribute.
   - Invoke the build function.
   - Check if the resulting ChatFunction object's executor attribute is correctly set.

5. Scenario: Test the build function with null values for attributes.
   Test Steps: 
   - Create an instance of the class where the build function resides.
   - Set the attributes to null.
   - Invoke the build function.
   - Check if the resulting ChatFunction object's attributes are null.

6. Scenario: Test the build function with empty strings for string attributes.
   Test Steps: 
   - Create an instance of the class where the build function resides.
   - Set the "name" and "description" attributes to empty strings.
   - Invoke the build function.
   - Check if the resulting ChatFunction object's name and description attributes are empty strings.

7. Scenario: Test the build function when the "executor" attribute is a function that throws an exception.
   Test Steps: 
   - Create an instance of the class where the build function resides.
   - Set the "executor" attribute to a function that throws an exception.
   - Invoke the build function.
   - Check if the resulting ChatFunction object's executor attribute is a function that throws an exception.
*/

// ********RoostGPT********
package com.theokanning.openai.completion.chat;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChatFunction_build_bfc1cf5abd_Test {

    private Builder builder;

    @Before
    public void setUp() {
        builder = new Builder();
    }

    @Test
    public void testBuildWithName() {
        String name = "testName";
        builder.name(name);

        ChatFunction chatFunction = builder.build();
        assertEquals(name, chatFunction.getName());
    }

    @Test
    public void testBuildWithDescription() {
        String description = "testDescription";
        builder.description(description);

        ChatFunction chatFunction = builder.build();
        assertEquals(description, chatFunction.getDescription());
    }

    @Test
    public void testBuildWithParametersClass() {
        Class<String> parametersClass = String.class;
        builder.parameters(parametersClass);

        ChatFunction chatFunction = builder.build();
        assertEquals(parametersClass, chatFunction.getParametersClass());
    }

    @Test
    public void testBuildWithExecutor() {
        Function<String, Object> executor = s -> s;
        builder.executor(String.class, executor);

        ChatFunction chatFunction = builder.build();
        assertEquals(executor, chatFunction.getExecutor());
    }

    @Test
    public void testBuildWithNullValues() {
        builder.name(null);
        builder.description(null);
        builder.parameters(null);
        builder.executor(null, null);

        ChatFunction chatFunction = builder.build();
        assertNull(chatFunction.getName());
        assertNull(chatFunction.getDescription());
        assertNull(chatFunction.getParametersClass());
        assertNull(chatFunction.getExecutor());
    }

    @Test
    public void testBuildWithEmptyStrings() {
        builder.name("");
        builder.description("");

        ChatFunction chatFunction = builder.build();
        assertEquals("", chatFunction.getName());
        assertEquals("", chatFunction.getDescription());
    }

    @Test(expected = RuntimeException.class)
    public void testBuildWithExceptionThrowingExecutor() {
        Function<String, Object> executor = s -> {
            throw new RuntimeException();
        };
        builder.executor(String.class, executor);

        ChatFunction chatFunction = builder.build();
        chatFunction.getExecutor().apply("test");
    }
}
