package com.javalab.sec02;

public class CarMain {
    public static void main(String[] args) {


        // 기본값으로 설정되는 Car 객체 생성(빈객체)
        Car myCar = new Car(); // 파라미터가 없는 생성자 호출

        // 빈 자동차 객체에 값 세팅
        myCar.company = "Ford";
        myCar.model = "청룡열차";
        myCar.color = "검정색";
        myCar.price = 3000;
        myCar.speed = 100;

        // 애초에 정상적인 값으로 세팅된 객체 생성
        Car car2 = new Car("기아자동차", "K5", "흰색", 2000, 200);
        System.out.println("제조사 : " + car2.company);
        System.out.println("모델명 : " + car2.model);
        System.out.println("색상 : " + car2.color);
        System.out.println("가격 : " + car2.price);
        System.out.println("속도 : " + car2.speed);


        // Car 객체의 필드값을 출력해주는 메소드 호출
        car2.carInfo();


    }
}