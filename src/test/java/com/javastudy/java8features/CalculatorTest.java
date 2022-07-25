package com.javastudy.java8features;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @DisplayName("Calculator 더하기 테스트")
    @Test
    public void additionCalculatorTest() {
        final Calculator calculator = new Calculator(new Addition());
        int result = calculator.calculate(1, 3);
        assertThat(result).isEqualTo(4); // 더하기 테스트.
    }

    @DisplayName("Calculator 빼기 테스트")
    @Test
    public void subtractionCalculatorTest() {
        final Calculator calculator = new Calculator(new Subtraction());
        int result = calculator.calculate(10, 3);
        assertThat(result).isEqualTo(7);
    }

    @DisplayName("Calculator 곱하기 테스트")
    @Test
    public void multipleCalculatorTest() {
        final Calculator calculator = new Calculator(new Multiplication());
        int result = calculator.calculate(4,5);
        assertThat(result).isEqualTo(20);
    }

    @DisplayName("Calculator 나누기 테스트")
    @Test
    public void divisionCalculatorTest() {
        final Calculator calculator = new Calculator(new Division());
        try {
            int result = calculator.calculate(10, 5);
            assertThat(result).isEqualTo(2);
        } catch (ArithmeticException e) {
            assertThat("divide by zero").isEqualTo(e.getMessage());
        }
    }

    @DisplayName("Calculator 나누기 테스트")
    @Test
    public void divisionZeroCalculatorTest() {
        final Calculator calculator = new Calculator(new Division());
        try {
            int result = calculator.calculate(10, 0);
        } catch (ArithmeticException e) {
            assertThat("divide by zero").isEqualTo(e.getMessage());
        }
    }
}