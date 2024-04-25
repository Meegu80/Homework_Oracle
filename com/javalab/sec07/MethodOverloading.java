package com.javalab.sec07;

/**
 * 메소드 오버로딩
 * - 같은 이름의 메소드를 여러개 정의하는 것
 * - 매개변수의 타입, 개수, 순서가 다르면 같은 이름의 메소드를 여러개 정의할 수 있다.
 * - 메소드 오버로딩은 메소드 이름이 같아야 하고, 매개변수의 타입, 개수, 순서가 달라야 한다.
 */
public class MethodOverloading {
    // 정수 덧셈
    public int add(int a, int b) {
        System.out.println("정수 덧셈 메소드");
        int sum = a + b;
        return sum;
    }
    // 실수 덧셈 메소드
    public double add(double a, double b) {
        System.out.println("실수 덧셈 메소드");
        double sum = a + b;
        return sum;
    }
    // 정수, 실수 덧셈 메소드
    public double add(int a, double b) {
        System.out.println("정수 실수 덧셈 메소드");
        double sum = a + b;
        return sum;
    }
}