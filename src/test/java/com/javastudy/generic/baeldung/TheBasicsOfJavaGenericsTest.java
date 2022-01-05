package com.javastudy.generic.baeldung;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TheBasicsOfJavaGenericsTest {

    @Test
    void Integer객체배열을_String객체리스트로_변환_가능() {
        Integer[] intArray = {1,2,3,4,5};
        List<String> stringList = TheBasicsOfJavaGenerics.fromArrayToList(intArray, Objects::toString);

        assertThat(stringList).contains("1","2","3","4","5");
    }

    @Test
    void bound경계값테스트() {
        Object[] numbers = {1, 0.1f, 1_000_000_000_000L, 3.141592};
//        List<Object> NumberList = TheBasicsOfJavaGenerics.fromArrayToList(numbers);
//        System.out.println(NumberList);
    }

    @Test
    void foo() {
        //legal
        Object obj = new String("Object에 String 객체를 넣을 수 있다.");
        // Illegal
//        List<Object> list = new List<String>();
    }
}