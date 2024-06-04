package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        // Given
        Logger logger = Logger.INSTANCE;
        logger.log("First log");

        // When
        String lastLog = logger.getLastLog();

        // Then
        assertEquals("First log", lastLog);
    }

    @Test
    void testLog() {
        // Given
        Logger logger = Logger.INSTANCE;

        // When
        logger.log("Another log");

        // Then
        assertEquals("Another log", logger.getLastLog());
    }
}
