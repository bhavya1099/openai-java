package com.theokanning.openai.completion.chat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import java.util.function.Function;

public class ChatFunctionNameTest {

    @Test
    public void testValidNameInput() {
        Builder builder = new Builder();
        Builder result = builder.name("John Doe");
        assertEquals("John Doe", result.name, "The name should be set to 'John Doe'");
    }

    @Test
    public void testNullNameInput() {
        Builder builder = new Builder();
        assertThrows(NullPointerException.class, () -> builder.name(null), "Should throw NullPointerException on null name");
    }

    @Test
    public void testEmptyStringName() {
        Builder builder = new Builder();
        Builder result = builder.name("");
        assertEquals("", result.name, "The name should be set to an empty string");
    }

    @Test
    public void testExtremelyLongNameInput() {
        Builder builder = new Builder();
        String longName = "a".repeat(1000);
        Builder result = builder.name(longName);
        assertEquals(longName, result.name, "The name should handle very long strings");
    }

    @Test
    public void testNameWithSpecialCharacters() {
        Builder builder = new Builder();
        String specialName = "Anna-Marie O'Neill";
        Builder result = builder.name(specialName);
        assertEquals(specialName, result.name, "The name should include special characters");
    }
}
