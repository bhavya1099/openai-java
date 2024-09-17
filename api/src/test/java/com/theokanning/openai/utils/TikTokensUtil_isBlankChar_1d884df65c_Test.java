// ********RoostGPT********
/*
Test generated by RoostGPT for test java-junit4-test using AI Type Open AI and AI Model gpt-4

Test Scenario 1: Testing with whitespace character
- Input: ' ' (ASCII value is 32)
- Expected output: True

Test Scenario 2: Testing with non-whitespace character
- Input: 'a' (ASCII value is 97)
- Expected output: False

Test Scenario 3: Testing with space character
- Input: ' ' (ASCII value is 32)
- Expected output: True

Test Scenario 4: Testing with non-space character
- Input: 'b' (ASCII value is 98)
- Expected output: False

Test Scenario 5: Testing with character code 65279
- Input: 65279
- Expected output: True

Test Scenario 6: Testing with character code other than 65279
- Input: 65280
- Expected output: False

Test Scenario 7: Testing with character code 8234
- Input: 8234
- Expected output: True

Test Scenario 8: Testing with character code other than 8234
- Input: 8235
- Expected output: False

Test Scenario 9: Testing with character code 0
- Input: 0
- Expected output: True

Test Scenario 10: Testing with character code other than 0
- Input: 1
- Expected output: False

Test Scenario 11: Testing with character code 12644
- Input: 12644
- Expected output: True

Test Scenario 12: Testing with character code other than 12644
- Input: 12645
- Expected output: False

Test Scenario 13: Testing with character code 10240
- Input: 10240
- Expected output: True

Test Scenario 14: Testing with character code other than 10240
- Input: 10241
- Expected output: False

Test Scenario 15: Testing with character code 6158
- Input: 6158
- Expected output: True

Test Scenario 16: Testing with character code other than 6158
- Input: 6159
- Expected output: False
*/

// ********RoostGPT********
package com.theokanning.openai.utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class TikTokensUtil_isBlankChar_1d884df65c_Test {

    @Test
    public void testIsBlankChar_Whitespace() {
        assertTrue(TikTokensUtil.isBlankChar(32));
    }

    @Test
    public void testIsBlankChar_NonWhitespace() {
        assertFalse(TikTokensUtil.isBlankChar(97));
    }

    @Test
    public void testIsBlankChar_SpaceChar() {
        assertTrue(TikTokensUtil.isBlankChar(32));
    }

    @Test
    public void testIsBlankChar_NonSpaceChar() {
        assertFalse(TikTokensUtil.isBlankChar(98));
    }

    @Test
    public void testIsBlankChar_Code65279() {
        assertTrue(TikTokensUtil.isBlankChar(65279));
    }

    @Test
    public void testIsBlankChar_NotCode65279() {
        assertFalse(TikTokensUtil.isBlankChar(65280));
    }

    @Test
    public void testIsBlankChar_Code8234() {
        assertTrue(TikTokensUtil.isBlankChar(8234));
    }

    @Test
    public void testIsBlankChar_NotCode8234() {
        assertFalse(TikTokensUtil.isBlankChar(8235));
    }

    @Test
    public void testIsBlankChar_Code0() {
        assertTrue(TikTokensUtil.isBlankChar(0));
    }

    @Test
    public void testIsBlankChar_NotCode0() {
        assertFalse(TikTokensUtil.isBlankChar(1));
    }

    @Test
    public void testIsBlankChar_Code12644() {
        assertTrue(TikTokensUtil.isBlankChar(12644));
    }

    @Test
    public void testIsBlankChar_NotCode12644() {
        assertFalse(TikTokensUtil.isBlankChar(12645));
    }

    @Test
    public void testIsBlankChar_Code10240() {
        assertTrue(TikTokensUtil.isBlankChar(10240));
    }

    @Test
    public void testIsBlankChar_NotCode10240() {
        assertFalse(TikTokensUtil.isBlankChar(10241));
    }

    @Test
    public void testIsBlankChar_Code6158() {
        assertTrue(TikTokensUtil.isBlankChar(6158));
    }

    @Test
    public void testIsBlankChar_NotCode6158() {
        assertFalse(TikTokensUtil.isBlankChar(6159));
    }
}
