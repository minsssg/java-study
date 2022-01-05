package com.javastudy.typeerasure;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");

        accept(al);
        // Object는 확실히 String의 슈퍼 타입이기 때문에 괜찮아보임.
    }

/*
    public static void accept(ArrayList<Object> al) {
        for (Object object : al) {
            System.out.println(object);
        }
    }
*/

    public static void accept(ArrayList<?> al) {
        for (Object object : al) {
            System.out.println(object);
        }
    }
}
