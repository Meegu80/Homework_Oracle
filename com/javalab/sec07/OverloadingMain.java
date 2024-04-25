package com.javalab.sec07;

public class OverloadingMain {
    public static void main(String[] args) {
        // MethodOverloading 객체 생성
        MethodOverloading mo = new MethodOverloading();
        int x = 5;
        int y = 6;
        int result1 = mo.add(x, y);
        System.out.printf("합계는 %d 입니다.", result1);

        double a = 5.5;
        double b = 6.6;
        double result2 = mo.add(a, b);
        System.out.printf("합계는 %.2f 입니다.", result2);

        double result3 = mo.add(x, a);
        System.out.println("합계는(3) " + result3 + " 입니다.");
    }
}