package com.liferay.clarity;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.jwt.Jwt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BaseRestController_log_e0ce4919a2_Test {

    @Mock
    Jwt jwt;

    @Mock
    Log log;

    @Value("${lxcDXPMainDomain}")
    protected String lxcDXPMainDomain;

    @Value("${lxcDXPServerProtocol}")
    protected String lxcDXPServerProtocol;

    @Test
    public void testLogInfoEnabled() {
        when(log.isInfoEnabled()).thenReturn(true);
        when(jwt.getClaims()).thenReturn(Map.of());
        when(jwt.getId()).thenReturn("testId");
        when(jwt.getSubject()).thenReturn("testSubject");

        new BaseRestController().log(jwt, log);

        verify(log, times(1)).info("JWT Claims: " + jwt.getClaims());
        verify(log, times(1)).info("JWT ID: " + jwt.getId());
        verify(log, times(1)).info("JWT Subject: " + jwt.getSubject());
    }

    @Test
    public void testLogInfoNotEnabled() {
        when(log.isInfoEnabled()).thenReturn(false);

        new BaseRestController().log(jwt, log);

        verify(log, never()).info(anyString());
    }

    @Test
    public void testWithNullJwt() {
        when(log.isInfoEnabled()).thenReturn(true);

        new BaseRestController().log(null, log);

        verify(log, never()).info(anyString());
    }
}
