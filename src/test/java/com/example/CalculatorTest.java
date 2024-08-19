package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testEvaluate() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.evaluate("2+2"));
    }

    @Test
    void testEvaluate2() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.evaluate("2+3"));
    }
}
