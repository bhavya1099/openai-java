package com.theokanning.openai.completion.chat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ChatCompletionRequestOfTest {

    @Test
    public void testValidFunctionCallName() {
        // Arrange
        String validName = "functionName";

        // Act
        ChatCompletionRequestFunctionCall result = ChatCompletionRequestFunctionCall.of(validName);

        // Assert
        assertNotNull(result, "The result should not be null");
        assertEquals(validName, result.getName(), "The name should be set correctly");
    }

    @Test
    public void testNullFunctionCallName() {
        // Arrange
        String nullName = null;

        // Act & Assert
        Exception exception = assertThrows(NullPointerException.class, () -> {
            ChatCompletionRequestFunctionCall.of(nullName);
        }, "Should throw NullPointerException for null name");
    }

    @Test
    public void testEmptyFunctionCallName() {
        // Arrange
        String emptyName = "";

        // Act
        ChatCompletionRequestFunctionCall result = ChatCompletionRequestFunctionCall.of(emptyName);

        // Assert
        assertNotNull(result, "The result should not be null");
        assertEquals(emptyName, result.getName(), "The name should be set as empty");
    }

    @Test
    public void testFunctionCallNameWithWhiteSpaces() {
        // Arrange
        String whiteSpaceName = "   ";

        // Act
        ChatCompletionRequestFunctionCall result = ChatCompletionRequestFunctionCall.of(whiteSpaceName);

        // Assert
        assertNotNull(result, "The result should not be null");
        assertEquals(whiteSpaceName, result.getName(), "The name should include the whitespace");
    }

    @Test
    public void testFunctionCallNameWithSpecialCharacters() {
        // Arrange
        String specialCharName = "@#$%^&*()";

        // Act
        ChatCompletionRequestFunctionCall result = ChatCompletionRequestFunctionCall.of(specialCharName);

        // Assert
        assertNotNull(result, "The result should not be null");
        assertEquals(specialCharName, result.getName(), "The name should include special characters");
    }
}
