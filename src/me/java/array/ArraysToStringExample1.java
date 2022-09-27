package me.java.array;

import java.util.Arrays;

public class ArraysToStringExample1 {
    public static void main(String[] args) {
        //일차원 배열 출력
        int [] arr = {1, 2, 3, 4, 5,};
        String[] strArr = {"Java", "JSP", "Servlet", "Spring"};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(strArr));
        Arrays.stream(arr).forEach((i) -> System.out.print(i + " "));
        Arrays.stream(strArr).forEach((i) -> System.out.print(i + " "));
        System.out.println();
    }
}
