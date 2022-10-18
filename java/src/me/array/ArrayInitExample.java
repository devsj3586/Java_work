package me.array;

import java.util.Scanner;

public class ArrayInitExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUM = 5;
        int[] scores1 = new int[NUM];
        for (int i = 0; i < scores1.length; i ++) {
            System.out.printf("%d 학생 성적 입려: ", i+1);
            scores1[i] = sc.nextInt();
        }
        for (int i = 0; i < scores1.length; i ++) {
            System.out.println("i =" + i + ", scores1[1] = " + scores1[i]);
        }
        System.out.println("===========================================");

        int[] scores2 = {90, 80, 77, 100, 65};
        for (int i = 0; i < scores2.length; i++) {
            System.out.println("i = " + i + ", scores2[i] = " + scores2[i]);
        }
        System.out.println("============================================");

        int[] scores4;
        scores4 = new int[]{90, 80, 77, 100, 65};
        for (int i = 0; i < scores4.length; i++) {
            System.out.println("i = " + i + ", scores4[i] = " + scores4[i]);
        }
        System.out.println("=============================================");

        int[] scores5 = {90, 80, 77, 100, 65};
        for (int score : scores5) {
            System.out.println("score = " + score);
        }
    }
}
