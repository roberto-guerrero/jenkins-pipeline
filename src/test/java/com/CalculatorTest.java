package com;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertThat;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void valueTest() {
        int result = calculator.sum(1, 4);
        assertThat("Result must be 5.", result, is(equalTo(5)));
    }

    @Test
    void rangeTest() {
        int result = calculator.sum(1, 4);
        assertThat("Result must be positive value.", result, is(greaterThan(0)));
    }
}
