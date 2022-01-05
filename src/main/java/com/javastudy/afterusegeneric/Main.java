package com.javastudy.afterusegeneric;

class Room<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
public class Main {

    public static void main(String[] args) {
        Room<Integer> room = new Room<>();
        room.add(60);
//        room.add("60");
        Integer i = room.get();
        System.out.println(i);
    }
}
