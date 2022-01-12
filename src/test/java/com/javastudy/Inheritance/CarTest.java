package com.javastudy.Inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private final Vehicle vehicle = new Vehicle();
    private final Vehicle car = new Car();

    @Test
    public void showReference() {
        System.out.println("vehicle = " + vehicle);
        System.out.println("car = " + car);
    }

    @Test
    public void vehicleCallAccelerate() {
        assertThat(vehicle.accelerate(100))
                .isEqualTo("vehicle 속력은 : 100 MPH.");
    }

    @Test
    public void carCallAccelerate() {
        assertThat(car.accelerate(100))
                .isEqualTo("자동차 속도 : 100 MPH");
    }

}