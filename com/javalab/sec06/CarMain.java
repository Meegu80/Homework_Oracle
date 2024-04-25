package com.javalab.sec06;

public class CarMain {
    public static void main(String[] args) {
        // 모델만 전달하는 Car 객체 생성
        Car car1 = new Car("자가용");
        car1.print();
        System.out.println();

        Car car2 = new Car("자가용", "빨강");
        car2.print();

        //모든 필드를 전달하는 Car 객체 생성
        Car car3 = new Car("택시", "검정",200);

    }
}