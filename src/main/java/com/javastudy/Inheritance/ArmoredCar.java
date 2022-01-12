package com.javastudy.Inheritance;

public class ArmoredCar extends Car implements Floatable, Flyable {

    int bulletProofWindows; // 방탄유리 갯수

    void remoteStart() {
        System.out.println("원격 출발");
    }

    @Override
    public void start() {
        System.out.println("누구의 매서드인가?");
    }
}
