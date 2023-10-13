package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    fib fib;
    @BeforeEach
    void setUp() {  fib = new fib(10); }



    @Test
    void main() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] actual = fib.getGeneratedNumbers();
        assertEquals(expected.length, actual.length);

        for (int i = 0; i < expected.length; i++)
        {
            assertEquals(expected[i], actual[i]);
        }
    }
}