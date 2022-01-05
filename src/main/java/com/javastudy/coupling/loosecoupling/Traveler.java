package com.javastudy.coupling.loosecoupling;

public class Traveler {

    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startJourney() {
        vehicle.move();
    }
}
