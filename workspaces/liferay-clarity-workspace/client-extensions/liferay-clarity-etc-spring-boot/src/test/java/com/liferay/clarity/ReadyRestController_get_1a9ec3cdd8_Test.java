package com.liferay.clarity;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ReadyRestController_get_1a9ec3cdd8_Test {

    @Test
    public void checkReturnValue() {
        ReadyRestController controller = new ReadyRestController();
        String result = controller.get();
        assertEquals("READY", result);
    }

    @Test
    public void checkReturnType() {
        ReadyRestController controller = new ReadyRestController();
        Object result = controller.get();
        assertTrue(result instanceof String);
    }

    @Test
    public void checkNullReturnValue() {
        ReadyRestController controller = new ReadyRestController();
        Object result = controller.get();
        assertNotNull(result);
    }
}
