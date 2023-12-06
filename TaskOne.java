package com.telran.org.homeworknighteen;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TaskOne {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

        List<String> collect1 = list.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect1);

        List<String> collect2 = list.stream()
                .sorted(Collections.reverseOrder())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect2);
    }
}
