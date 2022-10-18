package me.Printf;

public class PrintfExample {
    public static void main(String[] args) {
        int i = 10;
        float f = 12.3456f;
        double d = 56.78;
        char c = 'a';
        String s = "Hello world";
        boolean b = true;

        // int
        /*
        System.out.printf("%d\n", i);
        System.out.printf("%10d\n", i); // 오른쪽 정렬
        System.out.printf("%-10d\n", i); // 왼쪽 정렬
        System.out.printf("%010d\n", i); // 숫자(10)만큼 문자열 좌측에 0을 채워 숫자 길이를 만든다.
        System.out.printf("%o\n", i); // 8진수(octal) 형식으로 출력
        System.out.printf("%x\n", i); // 16진수(hexadecimal)형태로 출력
        System.out.printf("%X\n", i); // 16진수(hexadecimal)형태로 출력(X 대문자)
        System.out.printf("%n"); // 즐바꿈
        System.out.println(); // 줄바꿈 */

        // float

        System.out.printf("%f\n", f); // 해당 위치 숫자로 대체. 소수점 6자리(기본)까지 포함한다.
        System.out.printf("%.2f\n", f); // 점(.)오른쪽 숫자(2)만큼 소수점 이하를 반올림한다.
        System.out.printf("%.8f\n", f); // 부동 소수점의 오차 (**)
        System.out.printf("%5.2f\n", f); //  0.n번째(2)번째 소수 자리까지 출력, 다음 자리 반올림(데이터손실됨)
        System.out.printf("%-5.2f\n", f); // 실수 형식으로 출력
        System.out.printf("%e\n", f); // 지수 표현식의 형식으로 출력
        System.out.printf("%E\n", f); // 지수 표현식의 형식으로 출력
        System.out.printf("%30.3e\n", f);
        System.out.printf("%30.3E\n", f);
        System.out.println();

        // string
        System.out.printf("%s\n", s);
        System.out.printf("%s\n", s);
        System.out.printf("%30s\n", s);
        System.out.printf("%30S\n", s);
        System.out.println();

        //boolean
        System.out.printf("%b\n", b);
        System.out.printf("%B\n", b);
        System.out.printf("%30b\n", b);
        System.out.printf("%30B\n", b);
        System.out.println();

        // 변수에 저장하지 않은 리터럴도 가능
        System.out.printf("%d\n", 12345);
        System.out.printf("%f\n", 12.34);
        System.out.printf("%c\n", 'a');
        System.out.printf("%s\n", "a");
        System.out.printf("%b\n", true);
        System.out.println();

        // 변수의 자료형과 맞지 않은 지시자 사용 - 런타임 오류 발생 (IllegalFormatConversionException)
        System.out.printf("%c", i);
        System.out.printf("%d", b);

        // 존재하지 않은 지시자 사용 - 런타임 오류 발생 (IllegalFormatConversionException)
        System.out.printf("%a", i);
        System.out.printf("%k", i);
        System.out.printf("%q", i);

    }

}
