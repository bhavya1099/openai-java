package com.theokanning.openai.completion.chat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.Map;

class ChatCompletionRequestOfTest {

    @Test
    void testValidNameInput() {
        // Arrange
        String validName = "JohnDoe";

        // Act
        ChatCompletionRequestFunctionCall result = ChatCompletionRequestOf.of(validName);

        // Assert
        assertNotNull(result);
        assertEquals("JohnDoe", result.getName());
    }

    @Test
    void testNullNameInput() {
        // Arrange
        String nullName = null;

        // Act & Assert
        assertThrows(NullPointerException.class, () -> {
            ChatCompletionRequestFunctionCall result = ChatCompletionRequestOf.of(nullName);
        });
    }

    @Test
    void testEmptyStringName() {
        // Arrange
        String emptyName = "";

        // Act
        ChatCompletionRequestFunctionCall result = ChatCompletionRequestOf.of(emptyName);

        // Assert
        assertNotNull(result);
        assertEquals("", result.getName());
    }

    @Test
    void testNameWithSpecialCharacters() {
        // Arrange
        String specialName = "Name@123";

        // Act
        ChatCompletionRequestFunctionCall result = ChatCompletionRequestOf.of(specialName);

        // Assert
        assertNotNull(result);
        assertEquals("Name@123", result.getName());
    }

    @Test
    void testExtremelyLongNameString() {
        // Arrange
        StringBuilder longNameBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            longNameBuilder.append("a");
        }
        String longName = longNameBuilder.toString();

        // Act
        ChatCompletionRequestFunctionCall result = ChatCompletionRequestOf.of(longName);

        // Assert
        assertNotNull(result);
        assertEquals(longName, result.getName());
    }
}
