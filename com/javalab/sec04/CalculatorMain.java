package com.javalab.sec04;

public class CalculatorMain {
    public static void main(String[] args) {
        // Calculator 객체 생성
        Calculator myCalc = new Calculator();
        // 생성자 하나도 없으면 컴파일러가 bytecode 기본생성자가 만들어져서 넣어준다

        // powerOn() 메소드 호출
        myCalc.powerOn();

        // 두 수를 인자로 받아서 더하고 그 결과를 반환해주는 메소드 호출
        int result1 = myCalc.plus(6,7);
        System.out.println("result : "  + result1);

        int x= 10;
        int y = 3;
        double result2 = myCalc.divide(x,y); // 나눗셈 메소드 호출
        System.out.println(result2);


        myCalc.powerOff();      //전원 종료

    }
}
