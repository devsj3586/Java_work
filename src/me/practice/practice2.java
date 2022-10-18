package me.practice;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int max = 0;
        int min = 0;

        System.out.println("첫 번째 숫자를 입력해 주세요.");
        a = scanner.nextInt();
        System.out.println("두 번째 숫자를 입력해 주세요.");
        b = scanner.nextInt();

        if (a == b) {
            System.out.println("두 수는 같습니다.");
            return;
        } else if (a > b) {
            max = a;
            min = b;

        } else {
            max = b;
            min = a;
        }
        System.out.println("최댓값은 "+ max + " 이고, 최솟값은 " + min + " 입니다.");
    }
}
