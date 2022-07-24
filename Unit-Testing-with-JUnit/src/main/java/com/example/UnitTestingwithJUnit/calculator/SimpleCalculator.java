package com.example.UnitTestingwithJUnit.calculator;

public class SimpleCalculator {

    public int add(int numberA, int numberB) {
        return numberA + numberB;
    }

    public String numberCheck(int n) {
        if (n > 0) {
            return "positive";
        }
        if (n < 0) {
            return "negative";
        }
        return "";
    }
}
