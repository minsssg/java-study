package com.javastudy.genericmethods;

import java.util.HashSet;
import java.util.Set;

public class UseGenericMethod {
    public static <E> Set<E> getIntersection(Set<E> set1, Set<E> set2) {
        Set<E> result = new HashSet<E>();

        for (E o : set1) {
            if (set2.contains(o)) {
                result.add(o);
            }
        }

        return result;
    }
}
