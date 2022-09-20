package me.java.datatype;

public class DatatypeTest {
    public static void main(String[] args) {
        // 자료형 (datatype) : 스택(stack) 공간  - 비트수가 정해져있는
        // 원시 자료형 (primitive type)
        // int      (4byte == 32bit) : 2^32 개 저장가능=유효범위는 -2^31 ~ 2^31-1
        // float    (4byte == 32bit) :
        // double   (8byte == 64bit)
        // char     (2byte == 16bit)
        // 1byte = 8bit
        // ----------------------------
        // 참조형 (reference type): 힙(heap) 공간 - 비트수가 정해져있지않은
        // String -(클래스)이 누군가 만들어놓은


        // - 자료형 크기 비교

        //  byte (1)  < short (2)< int (4) < long (8) < float (4) < double (8) < String
        // 작은 발은 큰 신발에 들어갈 수 있음
        // 작은 리터럴은 큰 변수공간에 들어갈 수 있음
        byte y = (byte)1000;// type casting(명시적 형번환) 강제로 넣음 데이터 손실 있을수 있다.
        byte b = 10;        // 1byte = 4 byte : 10(들어갈수잇는 범위안에있다.)은 byte 에 들어갈수있어 자동으로 cast 해줌
        short s = 10;
        int i = 10;         // 정수의 기본 단위
        long l =10;         // 8byte = 4 byte :큰거는 작은거에 들어갈수있음 promotion(자동 형변환) 이라고함
        float f = 3.14f;    // 공간이 부족해서 오류  float 4byte 실수 3.14는 8byte 실수
        double d = 3.14;    // 실수의 기본 단위

        // 쓰레기값 예제
        // 유효범위가 부족해서 나오는것
        byte var1 = 125; // -128 ~ 127 쓸수있는 범위 127넘어가면 로테이션 돌아 -128부터 감
        int var2 = 125;

        for (int k = 0; k < 5; k ++) {
            var1++; // var1 = var1 + 1
            var2++; // var2 = var2 + 1
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);

        }

        // "a" + 130 = "a130"
        // 문자열 + 문자열 = 문자열의 결합
        // 문자열 + 정수 = 문자열의 결합 "a" + 130 = "a130" promotion 일어남
        // 정수가 문자열로 promotion 됨 문자열이 정수보다 크기가 더 크다.
        //    - [오버플로우와 언더플로우]
        //    - 변수에 선언된 데이터 범위를 벗어난 값을 할당할 때 발생
        //    - 자바에서는 오버플로우와 언더플로우에 대한 `예외를 발생하지 않음`
        //    - 오버플로우
        //        - 변수가 사용할 수 있는 데이터 범위보다 너무 큰 수를 사용할 경우
        //        - `byte b = (byte)128` -128로 출력
        //    - 언더플로우
        //        - 변수가 사용할 수 있는 데이터 범위보다 너무 작은 수를 사용할 경우
        //        - `byte b = (byte)-129` 127로 출력
    }
}
