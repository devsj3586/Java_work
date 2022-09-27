package me.java.array;

import java.util.Arrays;

public class ArraysToStringExample2 {
    public static void main(String[] args) {
        // 이차원 배열 출력
        int [][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        String[][] strArr = {{"A", "ab", "abc"},{"1", "12", "123"},{"a1", "b2", "c3"}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(strArr));
        Arrays.stream(arr).forEach((i) -> {
            Arrays.stream(i).forEach((j) -> System.out.print(j + " "));
            System.out.println();
        });
        Arrays.stream(strArr).forEach((i) -> {
            Arrays.stream(i).forEach((j) -> System.out.print(j + ""));
            System.out.println();
        });
    }
}
