package com.javastudy.Inheritance;

public class Vehicle {

    public String accelerate(long mph) {
        return "vehicle 속력은 : " + mph + " MPH.";
    }

    public String stop() {
        return "vehicle 멈춰!";
    }

    public String run() {
        return "vehicle 달리는 중";
    }
}
