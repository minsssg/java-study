package com.javastudy.coupling.loosecoupling;

public class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bike.move");
    }
}
