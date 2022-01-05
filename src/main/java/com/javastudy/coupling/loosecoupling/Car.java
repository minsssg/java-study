package com.javastudy.coupling.loosecoupling;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car.move");
    }
}
