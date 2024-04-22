package com.theokanning.openai.completion.chat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ChatFunctionParametersAddPropertyTest {
    private ChatFunctionParameters parameters;

    @BeforeEach
    void setUp() {
        parameters = new ChatFunctionParameters();
    }

    @Test
    public void addNewRequiredProperty() {
        ChatFunctionProperty property = new ChatFunctionProperty();
        property.setName("color");
        property.setRequired(true);

        parameters.addProperty(property);

        assertTrue(parameters.getProperties().containsKey("color"));
        assertTrue(parameters.getRequired().contains("color"));
    }

    @Test
    public void addNewOptionalProperty() {
        ChatFunctionProperty property = new ChatFunctionProperty();
        property.setName("size");
        property.setRequired(false);

        parameters.addProperty(property);

        assertTrue(parameters.getProperties().containsKey("size"));
        assertFalse(parameters.getRequired().contains("size"));
    }

    @Test
    public void addPropertyWithNullName() {
        ChatFunctionProperty property = new ChatFunctionProperty();
        property.setName(null);
        property.setRequired(true);

        Exception exception = assertThrows(NullPointerException.class, () -> {
            parameters.addProperty(property);
        });

        assertEquals("Property name cannot be null", exception.getMessage());
    }

    @Test
    public void addDuplicateProperty() {
        ChatFunctionProperty property1 = new ChatFunctionProperty();
        property1.setName("volume");
        property1.setRequired(true);

        ChatFunctionProperty property2 = new ChatFunctionProperty();
        property2.setName("volume");
        property2.setRequired(false);

        parameters.addProperty(property1);
        parameters.addProperty(property2);

        assertEquals(property2, parameters.getProperties().get("volume"));
        assertTrue(parameters.getRequired().contains("volume"));
    }

    @Test
    public void addPropertyWhenRequiredListIsNull() {
        parameters.setRequired(null);
        ChatFunctionProperty property = new ChatFunctionProperty();
        property.setName("theme");
        property.setRequired(true);

        parameters.addProperty(property);

        assertNotNull(parameters.getRequired());
        assertTrue(parameters.getRequired().contains("theme"));
    }
}
