package com.theokanning.openai.completion.chat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ChatFunctionDynamicParametersTest {

    private Builder builder;
    private ChatFunctionParameters parameters;

    @BeforeEach
    public void setUp() {
        builder = new Builder();
        parameters = new ChatFunctionParameters();
    }

    @Test
    public void testValidParametersProvided() {
        Builder returnedBuilder = builder.parameters(parameters);
        assertSame(builder, returnedBuilder, "The same Builder instance should be returned to support fluent interface");
        assertSame(parameters, returnedBuilder.parameters, "The parameters should be correctly set in the Builder");
    }

    @Test
    public void testNullParametersProvided() {
        assertThrows(NullPointerException.class, () -> builder.parameters(null), "Should throw NullPointerException on null input");
    }

    @Test
    public void testResettingWithNewParameters() {
        ChatFunctionParameters newParameters = new ChatFunctionParameters();
        builder.parameters(parameters); // Set initial parameters
        builder.parameters(newParameters); // Update to new parameters
        assertSame(newParameters, builder.parameters, "The parameters should be updated to the new ChatFunctionParameters object");
    }

    @Test
    public void testRepeatedCallsWithSameParameters() {
        builder.parameters(parameters);
        builder.parameters(parameters);
        assertSame(parameters, builder.parameters, "Repeated calls with the same parameters object should not alter the state unexpectedly");
    }
}
