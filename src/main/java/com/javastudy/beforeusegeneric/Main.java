package com.javastudy.beforeusegeneric;

class Room {
    private Object object;

    public void add(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }
}
public class Main {
    public static void main(String[] args) {
        Room room = new Room();
        room.add(60);
        room.add("60");

        Integer i = (Integer) room.get();
        System.out.println(i);
    }
}
