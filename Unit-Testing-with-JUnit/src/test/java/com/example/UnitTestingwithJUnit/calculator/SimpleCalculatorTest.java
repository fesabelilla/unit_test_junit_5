package com.example.UnitTestingwithJUnit.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoEqualsFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void sevenPlusThreeEqualsTen() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(7, 3));
    }

    @Test
    void checkPositiveNumber() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals("positive", calculator.numberCheck(12));
    }

    @Test
    void checkNegativeNumber() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals("negative", calculator.numberCheck(-10));
    }

    @Test
    void checkZero() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals("", simpleCalculator.numberCheck(0));
    }
}