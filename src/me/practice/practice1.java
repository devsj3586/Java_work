package me.practice;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        int price = 0;
        int payAmount = 0;
        int change = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("노트북 금액을 입력해 주세요.");
        price = scanner.nextInt();
        price = price + (price / 10);

        System.out.println("지불 금액을 입력해 주세요. ");

        payAmount = scanner.nextInt();

        change = payAmount - price;
        System.out.println("잔돈은" + change + "원 입니다.");


    }
}
