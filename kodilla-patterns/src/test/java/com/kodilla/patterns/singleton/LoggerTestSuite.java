package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        // Given
        Logger logger = new Logger();
        logger.log("First log");

        // When
        String result = logger.getLastLog();

        // Then
        assertEquals("First log", result);
    }
}