package com.telran.org.homeworknighteen;


import java.util.Arrays;
import java.util.List;

public class TaskTwo {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a1", "b5", "a2", "b4");
        System.out.println("Min result of steam : " +
                list.stream().min(((o1, o2) -> o1.compareTo(o2))).get());
    }
}
