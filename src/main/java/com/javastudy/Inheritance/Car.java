package com.javastudy.Inheritance;

public class Car extends Vehicle {

    String model;

    void start() {
        System.out.println("자동차 출발!");
    }

    @Override
    public String accelerate(long mph) {
        return "자동차 속도 : " + mph + " MPH";
    }
}
