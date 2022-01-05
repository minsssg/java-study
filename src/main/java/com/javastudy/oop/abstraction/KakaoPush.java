package com.javastudy.oop.abstraction;

public class KakaoPush implements Notifier {

    @Override
    public void cancelMessageSend(String item) {
        System.out.println("Kakao : " + item + " 주문을 취소합니다.");
    }
}
