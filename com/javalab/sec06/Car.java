package com.javalab.sec06;

/**
 * Car 도메인 클래스
 * this(..) 다른 생성자 호출
 * - 하나의 생성자에만 모든 초기화 코드 집중, 코드 중복 해소
 * - 나머지 생성자는 집중된 생성자를 호출
 * - 생성자의 맨 윗부분에 위치해야 함.
 * - this()는 생성자에서만 사용 가능
 */
public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int speed;

    // 생성자
    public Car() {
    }
    // 생성자2
    public Car(String model) {
        this(model, "흰색", 280); // 또 다른 생성자 호출
    }
    // 생성자3
    public Car(String model, String color) {
        this(model, color, 280); // 또 다른 생성자 호출
    }
    // 생성자4
    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    // 객체의 필드 정보 조회 메소드
    public void print() {
        System.out.println("company : " + company);
        System.out.println("model : " + model);
        System.out.println("color : " + color);
        System.out.println("speed : " + speed);
    }
}