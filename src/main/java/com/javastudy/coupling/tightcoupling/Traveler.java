package com.javastudy.coupling.tightcoupling;

public class Traveler {
    // Tight Coupling
    Car car = new Car();

    public void startJourney() {
        car.move();
    }
}
