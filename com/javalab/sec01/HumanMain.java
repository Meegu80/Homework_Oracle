package com.javalab.sec01;


public class HumanMain {
    public static void main(String[] args) {


        // Human 객체 생성
        // Human : 도메인 클래스 이름
        // human : 객체 참조 변수
        // new : 객체 생성 연산자
        // Human() : 생성자로 객체 초기화
        Human human = new Human();
        // 객체의 속성이 갖고 있는 기본값 확인
        System.out.println(human.age);
        System.out.println(human.ssn);
        System.out.println("============================================");

        //생성
        human.ssn = "801028-1726384";
        human.name = "정민수";
        human.age = 25;

        // 객체의 속성값 확인

        System.out.println(human.name);
        System.out.println(human.ssn);
        System.out.println(human.age + "세 입니다");
        System.out.println("============================================");

        // 추가된 생성자를 호출해서 객체 초기화
        Human human2 = new Human("911028-3726384", "최소민", 21);
        //객체의 속성값 확인
        System.out.println(human2.name);
        System.out.println(human2.ssn);
        System.out.println(human2.age);
        System.out.println("============================================");


    }
}