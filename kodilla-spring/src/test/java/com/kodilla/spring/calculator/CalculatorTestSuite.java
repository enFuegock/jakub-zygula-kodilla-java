package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        // Given

        // When
        double addResult = calculator.add(5.0, 3.0);
        double subResult = calculator.sub(5.0, 3.0);
        double mulResult = calculator.mul(5.0, 3.0);
        double divResult = calculator.div(6.0, 3.0);

        // Then
        assertEquals(8.0, addResult);
        assertEquals(2.0, subResult);
        assertEquals(15.0, mulResult);
        assertEquals(2.0, divResult);
    }
}