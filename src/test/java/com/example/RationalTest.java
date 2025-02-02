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
    void testOfWithNewParameters() {
        BigInteger numerator = new BigInteger(String.valueOf(2));
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
    void testEqualsWithDifferentValues() {
        Rational rational1 = Rational.of(4);
        Rational rational2 = Rational.of(4);
        assertEquals(rational2, rational1);
    }
}
