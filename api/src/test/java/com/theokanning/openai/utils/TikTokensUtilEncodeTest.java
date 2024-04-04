package com.theokanning.openai.utils;

import com.knuddels.jtokkit.Encodings;
import com.knuddels.jtokkit.api.Encoding;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class TikTokensUtilEncodeTest {

    @Test
    public void testEncodeNonEmptyString() {
        // Arrange
        Encoding enc = Encodings.newDefaultEncodingRegistry().getEncoding("UTF-8");
        String text = "Hello, World!";

        // Act
        List<Integer> result = TikTokensUtil.encode(enc, text);

        // Assert
        // TODO: Replace with the expected encoded result.
        List<Integer> expected = new ArrayList<>(); // Replace with the expected encoded result.
        assertEquals(expected, result);
    }

    @Test
    public void testEncodeEmptyString() {
        // Arrange
        Encoding enc = Encodings.newDefaultEncodingRegistry().getEncoding("UTF-8");
        String text = "";

        // Act
        List<Integer> result = TikTokensUtil.encode(enc, text);

        // Assert
        assertTrue(result.isEmpty());
    }

    @Test
    public void testEncodeNullString() {
        // Arrange
        Encoding enc = Encodings.newDefaultEncodingRegistry().getEncoding("UTF-8");
        String text = null;

        // Act
        List<Integer> result = TikTokensUtil.encode(enc, text);

        // Assert
        assertTrue(result.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeWithNullEncoding() {
        // Arrange
        Encoding enc = null;
        String text = "Hello, World!";

        // Act
        TikTokensUtil.encode(enc, text);

        // Assert is handled by the 'expected' parameter in the @Test annotation
    }
}
