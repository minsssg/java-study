package com.javastudy.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoFactSet {

    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        printSet(s1);
        HashSet<String> s2 = new HashSet<>(Arrays.asList("a", "b", "c"));
        printSet(s2);
    }

    public static void printSet(Set<?> s) {
        for (Object o : s) {
            System.out.println(o);
        }
    }
}
