package com;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertThat;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void TestSumValue() {
        int result = calculator.sum(1, 4);
        assertThat("Result must be 5.", result, is(equalTo(5)));
    }

    @Test
    void TestPositive() {
        int result = calculator.sum(1, 4);
        assertThat("Result must be positive value.", result, is(greaterThan(0)));
    }

    @Test
    void TestSubstractValue() {
        int result = calculator.substract(4, 3);
        assertThat("Result must be 1.", result, is(equalTo(1)));
    }

    @Test
    void TestMultiplyValue() {
        int result = calculator.multiply(4, 3);
        assertThat("Result must be 12.", result, is(equalTo(12)));
    }
}
