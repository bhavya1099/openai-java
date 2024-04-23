package com.theokanning.openai.completion.chat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import java.util.function.Function;

class ChatFunctionNameTest {
    private Builder builder;

    @BeforeEach
    void setUp() {
        builder = new Builder();
    }

    @Test
    void testValidNameInput() {
        String expectedName = "John Doe";
        Builder resultBuilder = builder.name(expectedName);
        assertSame(builder, resultBuilder, "Returned builder should be the same instance");
        assertEquals(expectedName, builder.getName(), "The name field should be set to 'John Doe'");
    }

    @Test
    void testNullNameInput() {
        Builder resultBuilder = builder.name(null);
        assertSame(builder, resultBuilder, "Returned builder should be the same instance");
        assertNull(builder.getName(), "The name field should be set to null");
    }

    @Test
    void testEmptyStringName() {
        String expectedName = "";
        Builder resultBuilder = builder.name(expectedName);
        assertSame(builder, resultBuilder, "Returned builder should be the same instance");
        assertEquals(expectedName, builder.getName(), "The name field should be set to an empty string");
    }

    @Test
    void testLongStringName() {
        String longName = "a".repeat(1000); // Generate a string with 1000 'a' characters
        Builder resultBuilder = builder.name(longName);
        assertSame(builder, resultBuilder, "Returned builder should be the same instance");
        assertEquals(longName, builder.getName(), "The name field should handle long strings");
    }

    @Test
    void testSpecialCharactersInName() {
        String specialName = "Name@123!";
        Builder resultBuilder = builder.name(specialName);
        assertSame(builder, resultBuilder, "Returned builder should be the same instance");
        assertEquals(specialName, builder.getName(), "The name field should correctly store special characters");
    }
}
