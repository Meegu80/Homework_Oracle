package com.javalab.sec02;

public class Car {

    String company;
    String model;
    String color;
    int  price;
    int speed;

    public Car(){
        System.out.println("여기는 Car 클래스 생성자");
    }


    public Car(String company, String model, String color, int price, int speed){

        this.company = company;
        this.model = model;
        this.color = color;
        this.price = price;
        this.speed = speed;
    }
    // Car의 정보를 보여주는 메소드
    public  void carInfo(){
        System.out.println("제조사 : " + this.company);
        System.out.println("모델명 : " + this.model);
        System.out.println("색상 : " + this.color);
        System.out.println("가격 : " + this.price);
        System.out.println("속도 : " + this.speed);
    }

}
