package com.liferay.clarity;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.oauth2.jwt.Jwt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BaseRestController_log_e0ce4919a2_Test {

    @Mock
    private Log log;

    @Mock
    private Jwt jwt;

    private BaseRestController baseRestController = new BaseRestController();

    @Test
    public void testLogInfoEnabled() {
        when(log.isInfoEnabled()).thenReturn(true);
        when(jwt.getClaims()).thenReturn(Map.of());
        when(jwt.getId()).thenReturn("1");
        when(jwt.getSubject()).thenReturn("subject");

        baseRestController.log(jwt, log);

        verify(log, times(1)).info("JWT Claims: " + jwt.getClaims());
        verify(log, times(1)).info("JWT ID: " + jwt.getId());
        verify(log, times(1)).info("JWT Subject: " + jwt.getSubject());
    }

    @Test
    public void testLogInfoNotEnabled() {
        when(log.isInfoEnabled()).thenReturn(false);

        baseRestController.log(jwt, log);

        verify(log, never()).info(anyString());
    }

    @Test
    public void testJwtNull() {
        when(log.isInfoEnabled()).thenReturn(true);

        baseRestController.log(null, log);

        verify(log, never()).info(anyString());
    }

    @Test
    public void testLogNull() {
        baseRestController.log(jwt, null);
    }
}
