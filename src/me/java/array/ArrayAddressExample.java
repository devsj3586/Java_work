package me.java.array;

public class ArrayAddressExample {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Memory address: " + VM.current().addressOf(nums));
        System.out.println("Array: " + nums);
        System.out.println();
    }
}
