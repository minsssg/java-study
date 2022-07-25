package com.javastudy.java8features;

public class Division implements Calculation {

    @Override
    public int calculate(int x, int y) {
        return x / y;
    }
}
