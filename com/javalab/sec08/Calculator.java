package com.javalab.sec08;

/**
 * 정적멤버(변수, 메소드)와 인스턴스 멤버(변수, 메소드)
 */
public class Calculator {
    // 인스턴스 변수(필드, 속성)
    String color;
//    static double pi = 3.141592;

    // 인스턴스 메소드
    void setColor(String color) {
        this.color = color;
    }

    // 정적 변수
    static double pi = 3.141592;

    // 정적 메소드
    static int plus(int x, int y) {
        return x + y;
    }

    // 정적 메소드
    static int minus(int x, int y) {
        return x - y;
    }
}