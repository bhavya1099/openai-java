package com.theokanning.openai.completion.chat;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ChatFunctionNameTest {

    @Test
    public void testNameWithValidInput() {
        ChatFunction.Builder builder = new ChatFunction.Builder();
        String name = "TestName";
        builder.name(name);
        assertEquals("The name should be set correctly", name, builder.name);
    }

    @Test
    public void testNameWithNullInput() {
        ChatFunction.Builder builder = new ChatFunction.Builder();
        builder.name(null);
        assertNull("The name should be null", builder.name);
    }

    @Test
    public void testNameWithEmptyString() {
        ChatFunction.Builder builder = new ChatFunction.Builder();
        builder.name("");
        assertEquals("The name should be an empty string", "", builder.name);
    }

    @Test
    public void testNameWithLongString() {
        ChatFunction.Builder builder = new ChatFunction.Builder();
        String longName = "ThisIsAVeryLongNameThatExceedsTheNormalLengthOfAName";
        builder.name(longName);
        assertEquals("The name should be set correctly", longName, builder.name);
    }
}
