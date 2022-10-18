package me.string;

public class StringBuilderExample {
    public static void main(String[] args) {
        // 수정이 필요한 문자열은 StringBuilder 객체에 저장
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");

        // 수정 완료되면 상수로 바꾸기
        String s = sb.toString();
        System.out.println(s);
    }
}