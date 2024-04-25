package com.javalab.sec05;

public class Computer {
    // 필드(속성, 변수)
    int sum;

    // 가변길이 매개변수를 갖는 메소드
    public int sum(int ... values) {
        // sum 변수 선언
        sum = 0;

        // values는 배열 타입의 변수처럼 사용
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        // 합산 결과를 리턴
        return sum;
    }
}