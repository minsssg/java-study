package com.javastudy.oop.abstraction;

/**
 * 시나리오
 * 1. 주문 취소 시, 휴대폰 문자 메신저로 주문 취소 알람 전송
 * 2. 주문 취소 시, 카카오톡으로도 취소 알람 전송
 * 3. 주문 취소 시, 이메일로 취소 알람 전송
 *
 * 주문 취소 로직은 그대로이지만, 취소 알림 전송 코드가 계속 늘어나고 있음.
 * 주문 취소 메서드 기능보다 불필요한 기능이 많이 차지하고 있음.
 * 추상화를 통해 리펙토링하자.
 *
 * 이제 알람 전송이 추가 되어도 cancel 메서드를 변경하지 않아도 된다.
 */
public class OrderService {

    private SmsSender smsSender = new SmsSender();
    private KakaoPush kakaoPush = new KakaoPush();
    private EmailSender emailSender = new EmailSender();

    public void cancel(String item, boolean isKakaoPush, boolean isSmsSend, boolean isEmailSend) {

        // 주문 취소 로직
        System.out.println("'" + item + "' 상품 주문을 취소합니다.");

//        if (isKakaoPush) {
//            kakaoPush.cancelMessageSend(item);
//        }
//
//        if (isSmsSend) {
//            smsSender.cancelMessageSend(item);
//        }
//
//        if (isEmailSend) {
//            emailSender.cancelMessageSend(item);
//        }

        sendMessage(item, isKakaoPush, isSmsSend, isEmailSend);
    }

    private void sendMessage(String item, boolean isKakaoPush, boolean isSmsSend, boolean isEmailSend) {
        Notifier notifier;

        if (isKakaoPush) {
            notifier = new KakaoPush();
            notifier.cancelMessageSend(item);
        }

        if (isSmsSend) {
            notifier = new SmsSender();
            notifier.cancelMessageSend(item);
        }

        if (isEmailSend) {
            notifier = new EmailSender();
            notifier.cancelMessageSend(item);
        }
    }
}
