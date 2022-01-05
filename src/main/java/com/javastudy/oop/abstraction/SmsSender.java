package com.javastudy.oop.abstraction;

public class SmsSender implements Notifier {

    @Override
    public void cancelMessageSend(String item) {
        System.out.println("Sms : " + item + " 주문을 취소합니다.");
    }
}
