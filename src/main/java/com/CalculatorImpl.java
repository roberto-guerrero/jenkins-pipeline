package com;

public class CalculatorImpl {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int value1 = 99;
        int value2 = 100;

        int result = calc.sum(value1 value2);

        System.out.println("Result = " + result);
    }
}
