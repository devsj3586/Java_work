package me.practice;

public class star {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > 0; j--) {
                if (i < j ) {
                    System.out.println("if 에서 i : " +i);
                    System.out.println("if 에서 j : " +j);
                    System.out.println("j 가 더 큼");
                    System.out.print(" ");
                }else{
                    System.out.println("else 에서 i : " +i);
                    System.out.println("else 에서 j : " +j);
                    System.out.println("i 가 더 큼");
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
