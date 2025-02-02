package com.example;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RationalTest {

    @Test
    void testOf() {
        BigInteger numerator = BigInteger.ONE;
        BigInteger denominator = BigInteger.ZERO;
        assertThrows(IllegalArgumentException.class, () -> Rational.of(numerator, denominator));
    }

    @Test
    void testEquals() {
        Rational rational1 = Rational.of(3);
        Rational rational2 = Rational.of(3);
        assertEquals(rational2, rational1);
    }

    @Test
    void testOfNew() {
        BigInteger numerator = BigInteger.valueOf(3);
        BigInteger denominator = BigInteger.ZERO;
        assertThrows(IllegalArgumentException.class, () -> Rational.of(numerator, denominator));
    }
}
