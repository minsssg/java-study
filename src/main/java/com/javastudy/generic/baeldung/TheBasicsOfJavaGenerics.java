package com.javastudy.generic.baeldung;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TheBasicsOfJavaGenerics {

    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(new Integer(1));
        Integer i = (Integer) list.iterator().next();
    }

    public static <T, G> List<G> fromArrayToList(T[] a, Function<T,G> mapperFunction) {
        return Arrays.stream(a)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }

    public static <T extends Number> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }
}
