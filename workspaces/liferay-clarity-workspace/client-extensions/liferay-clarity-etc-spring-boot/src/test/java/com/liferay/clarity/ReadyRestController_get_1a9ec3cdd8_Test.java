package com.liferay.clarity;

import org.junit.Assert;
import org.junit.Test;

public class ReadyRestController_get_1a9ec3cdd8_Test {
    
    ReadyRestController readyRestController = new ReadyRestController();

    @Test
    public void testIfMethodReturnsExpectedString() {
        String expectedValue = "READY";
        String actualValue = readyRestController.get();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testIfMethodReturnsStringType() {
        String returnValue = readyRestController.get();
        Assert.assertTrue(returnValue instanceof String);
    }

    @Test
    public void testIfMethodReturnsCorrectLength() {
        int expectedLength = 5;
        int actualLength = readyRestController.get().length();
        Assert.assertEquals(expectedLength, actualLength);
    }
}
