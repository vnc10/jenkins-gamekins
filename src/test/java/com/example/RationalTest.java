package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RationalTest {

    @Test
    void testEquals() {
        Rational rational1 = Rational.of(3);
        Rational rational2 = Rational.of(3);
        assertEquals(rational2, rational1);
    }
}
