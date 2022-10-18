package me.practice;

import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int year = 0;

        System.out.println("연도를 입력해 주세요.");
        year = scanner.nextInt();

        if (year %4 ==0 && year % 100 !=0) {
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년운 평년입니다.");
        }
    }
}
