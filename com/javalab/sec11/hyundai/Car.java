package com.javalab.sec11.hyundai;

import com.javalab.sec11.hankook.SnowTire;
import com.javalab.sec11.hankook.SnowTire;
// import com.javalab.sec11.hankook.*; hankook 패키지 내 모든 클래스를 import한다
import com.javalab.sec11.kumho.AllSeasonTire;

public class Car {
    // 멤버 변수(필드, 속성) 선언
//    Tire tire = new Tire(); 이번줄에서 한국타이어 클래스를 지정하면 아래것도 한국타이어꺼를 쓴다
//    Tire tire1 = new Tire(); //tire1은 금호를 사용하고 싶다면 아래용례처럼 해야한다.

    com.javalab.sec11.kumho.Tire tire = new com.javalab.sec11.kumho.Tire();
    com.javalab.sec11.hankook.Tire tire1 = new com.javalab.sec11.hankook.Tire();
    SnowTire snowTire = new SnowTire(); // 스노우 타이어
    AllSeasonTire allSeasonTire = new AllseasonTire(); // 올시즌 타이어
    // Tire클래스 2개를 다 사용하기 위해 위와같이 풀경로 입력해서 지정해준다, 이런 사용은 지양해야한다.


    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.tire.tireInfo();

        // 스노우 타이어

    }
}
