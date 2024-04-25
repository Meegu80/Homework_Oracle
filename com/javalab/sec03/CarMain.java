package com.javalab.sec03;

public class CarMain {
    public static void main(String[] args) {
        //기본값으로 세팅되는 객체 생성 및 필드값 출력
        Car mycar = new Car();
        System.out.println(mycar);
        System.out.println("----------------------------");

        // 모델값만 초기화하는 생성자
        Car car1 = new Car("제네시스");
        car1.carInfo();
        System.out.println("----------------------------");
        // 모델, 색상값만 초기화하는 생성자
        Car car2 = new Car("제네시스", "흰색");
        car2.carInfo();
        System.out.println("----------------------------");
        Car car3 = new Car("제네시스", "흰색",5000);
        car3.carInfo();
        System.out.println("----------------------------");
        Car car4 = new Car("제네시스", "흰색",5000,140);
        car4.carInfo();
        System.out.println("----------------------------");


//        Car mycar = new Car();
//        Car mycar = new Car();
//        Car mycar = new Car();
//        Car mycar = new Car();
//
    }


}
