package com.javastudy.coupling;

import com.javastudy.coupling.loosecoupling.Bike;
import com.javastudy.coupling.loosecoupling.Car;
import com.javastudy.coupling.loosecoupling.Traveler;

public class Main {

    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        traveler.setVehicle(new Car()); // Inject Car dependency
        traveler.startJourney(); // start journey by Car
        traveler.setVehicle(new Bike()); // Inject Bike dependency
        traveler.startJourney(); // Start journey by Bike
    }
}
