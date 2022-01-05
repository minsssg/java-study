package com.javastudy.oop.abstraction;

public class EmailSender implements Notifier {

    @Override
    public void cancelMessageSend(String item) {
        System.out.println("Email : " + item + " 주문을 취소합니다.");
    }
}
