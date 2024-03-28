package com.theokanning.openai.completion.chat;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChatFunctionDynamicNameTest {

    private ChatFunctionDynamic.Builder builder;

    @Before
    public void setUp() {
        builder = new ChatFunctionDynamic.Builder();
    }

    @Test
    public void testNameWithValidInput() {
        String input = "validName";
        builder.name(input);
        assertEquals(input, builder.getName());
    }

    @Test(expected = NullPointerException.class)
    public void testNameWithNullInput() {
        builder.name(null);
    }

    @Test
    public void testNameWithEmptyString() {
        String input = "";
        builder.name(input);
        assertEquals(input, builder.getName());
    }
}
