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

    @Test
    void testEquals2() {
        Rational rational1 = Rational.of(5);
        Rational rational2 = Rational.of(5);
        assertEquals(rational2, rational1);
    }

    @Test
    void testEquals2ASD() {
        Rational rational1 = Rational.of(8);
        Rational rational2 = Rational.of(8);
        assertEquals(rational2, rational1);
    }

    @Test
    void testEquals2ASDssdd() {
        Rational rational1 = Rational.of(89);
        Rational rational2 = Rational.of(89);
        assertEquals(rational2, rational1);
    }

    @Test
    void testEquals2ASDssdddasdasasd() {
        Rational rational1 = Rational.of(89);
        Rational rational2 = Rational.of(89);
        assertEquals(rational2, rational1);
    }

    @Test
    void testEquals2ASDssdddasdasasdasdads() {
        Rational rational1 = Rational.of(890);
        Rational rational2 = Rational.of(890);
        assertEquals(rational2, rational1);
    }

    @Test
    void testEquals2ASDssdddasdasasdasdadasdasadss() {
        Rational rational1 = Rational.of(900);
        Rational rational2 = Rational.of(900);
        assertEquals(rational2, rational1);
    }

    @Test
    void testEquals2ASDssdddasdasasdasdadasdasadssasdasadsads() {
        Rational rational1 = Rational.of(900);
        Rational rational2 = Rational.of(900);
        assertEquals(rational2, rational1);
    }

    @Test
    void testEquals3() {
        Rational rational1 = Rational.of(3);
        Rational.ofLong(3L);
        assertEquals(rational1, Rational.ofLong(3L));
    }

    @Test
    void testEquals4() {
        Rational rational1 = Rational.of(4);
        assertEquals(rational1, Rational.ofLong(4L));
    }

    @Test
    void testEquals2New() {
        Rational rational1 = Rational.of(6);
        Rational rational2 = Rational.of(6);
        assertEquals(rational2, rational1);
    }

    @Test
    void testEquals2News() {
        Rational rational1 = Rational.of(7);
        Rational rational2 = Rational.of(7);
        assertEquals(rational2, rational1);
    }
}
