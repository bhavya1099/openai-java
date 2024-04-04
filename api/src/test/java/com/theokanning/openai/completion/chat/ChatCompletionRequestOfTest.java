package com.theokanning.openai.completion.chat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChatCompletionRequestOfTest {

    @Test
    public void testValidInput() {
        String validInput = "validName";
        ChatCompletionRequestFunctionCall result = ChatCompletionRequestFunctionCall.of(validInput);
        assertNotNull(result);
        assertEquals(validInput, result.getName());
    }

    @Test
    public void testNullInput() {
        assertThrows(NullPointerException.class, () -> {
            ChatCompletionRequestFunctionCall.of(null);
        });
    }

    @Test
    public void testEmptyStringInput() {
        String emptyString = "";
        assertThrows(IllegalArgumentException.class, () -> {
            ChatCompletionRequestFunctionCall.of(emptyString);
        });
    }
}
