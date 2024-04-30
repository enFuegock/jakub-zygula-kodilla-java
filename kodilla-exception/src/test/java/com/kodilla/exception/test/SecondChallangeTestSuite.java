package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallangeTestSuite {

    private final ExceptionHandling exceptionHandling = new ExceptionHandling();

    @Test
    void shouldHandleSecondChallenge() {
        // given
        double x = 1.0;
        double y = 2.0;
        // when & then
        assertDoesNotThrow(() -> exceptionHandling.handleSecondChallenge(x, y));
    }

    @Test
    void shouldHandleSecondChallengeException() {
        // given
        double x = 2.0;
        double y = 1.5;
        // when & then
        assertDoesNotThrow(() -> exceptionHandling.handleSecondChallenge(x, y));
    }
}
