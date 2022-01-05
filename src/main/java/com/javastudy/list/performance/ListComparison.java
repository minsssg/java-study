package com.javastudy.list.performance;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListComparison {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int size = 100_000;

        // ArrayList add
        long startTime = System.nanoTime();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList add : " + duration);

        // LinkedList add
        startTime = System.nanoTime();

        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add : " + duration);

        // ArrayList get
        startTime = System.nanoTime();

        for (int i = 0; i < size; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList get : " + duration);

        startTime = System.nanoTime();

        for (int i = 0; i < size; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList get : " + duration);

        // ArrayList remove
        startTime = System.nanoTime();
        for (int i = size - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList remove : " + duration);

        // LinkedList remove
        startTime = System.nanoTime();

        for (int i = size -1; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove: " + duration);
    }
}
