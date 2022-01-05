package com.javastudy.genericmethods;

import java.util.HashSet;
import java.util.Set;

public class Main {
    // Not type-safe
    // Compiler gives warnings
    public static Set getIntersection(Set set1, Set set2) {
        Set result = new HashSet();
        for (Object o : set1) {
            if (set2.contains(o)) {
                result.add(o);
            }
        }

        return result;
    }

}
