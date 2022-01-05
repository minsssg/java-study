package com.javastudy.oop.abstraction;

public class Order {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        orderService.cancel("노트북", true, true, true);
    }
}
