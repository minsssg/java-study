package com.javastudy.comparison;

import com.javastudy.entity.Human;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class JavaComparisonWithLambda {

    @Test
    void 람다없이_정렬하기 () {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Sarah", 10));
        humans.add(new Human("Jack", 12));

        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        assertThat(humans.get(0)).isEqualTo(new Human("Jack", 12));
    }
}
