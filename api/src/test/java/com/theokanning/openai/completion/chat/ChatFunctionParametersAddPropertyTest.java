package com.theokanning.openai.completion.chat;

import lombok.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChatFunctionParametersAddPropertyTest {

    @Test
    public void testAddNonRequiredProperty() {
        ChatFunctionParameters chatFunctionParameters = new ChatFunctionParameters();

        ChatFunctionProperty property = new ChatFunctionProperty();
        property.setName("testProperty");
        property.setRequired(false);

        chatFunctionParameters.addProperty(property);

        assertTrue(chatFunctionParameters.getProperties().containsKey("testProperty"));
        assertFalse(chatFunctionParameters.getRequired().contains("testProperty"));
    }

    @Test
    public void testAddRequiredProperty() {
        ChatFunctionParameters chatFunctionParameters = new ChatFunctionParameters();

        ChatFunctionProperty property = new ChatFunctionProperty();
        property.setName("testProperty");
        property.setRequired(true);

        chatFunctionParameters.addProperty(property);

        assertTrue(chatFunctionParameters.getProperties().containsKey("testProperty"));
        assertTrue(chatFunctionParameters.getRequired().contains("testProperty"));
    }

    @Test
    public void testAddPropertyWithExistingName() {
        ChatFunctionParameters chatFunctionParameters = new ChatFunctionParameters();

        ChatFunctionProperty property1 = new ChatFunctionProperty();
        property1.setName("testProperty");
        property1.setRequired(false);

        ChatFunctionProperty property2 = new ChatFunctionProperty();
        property2.setName("testProperty");
        property2.setRequired(true);

        chatFunctionParameters.addProperty(property1);
        chatFunctionParameters.addProperty(property2);

        assertEquals(property2, chatFunctionParameters.getProperties().get("testProperty"));
        assertTrue(chatFunctionParameters.getRequired().contains("testProperty"));
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullProperty() {
        ChatFunctionParameters chatFunctionParameters = new ChatFunctionParameters();
        chatFunctionParameters.addProperty(null);
    }
}
