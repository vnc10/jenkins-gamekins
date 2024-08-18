package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    Addition addition = new Addition();

    @Test
    void testAddOneTwo() {
        assertEquals(3, addition.add(1, 2));
    }

    @Test
    void testAddTenThree() {
        assertEquals(13, addition.add(10, 3));
    }

    @Test
    void testAddNegative() {
        assertEquals(0, addition.add(1, -1));
    }

    @Test
    void testAddNegative2() {
        assertEquals(-1, addition.add(2, -3));
    }

    @Test
    void testAddNegativeValues() {
        assertEquals(-2, addition.add(1, -3));
    }   @Test

    @org.junit.Test
    void coverApp() {
        App.main(new String[]{});
    }
}