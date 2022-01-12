package com.javastudy.Inheritance;

public class CarDemo {

    public static void main(String[] args) {
        ArmoredCar armoredCar = new ArmoredCar();

        // 부모기능 자식기능
        armoredCar.start();
        armoredCar.remoteStart();
    }
}
