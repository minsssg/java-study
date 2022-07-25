package com.javastudy.java8features;

public class Calculator {
    private final Calculation calculation;

    public Calculator(Calculation calculation) {
        this.calculation = calculation;
    }

    public int calculate(int x, int y) throws ArithmeticException {
        if (y == 0) throw new ArithmeticException("divide by zero");
        return calculation.calculate(x,y);
    }
}
