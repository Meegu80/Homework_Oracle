package com.javalab.sec08;
/**
 * 정적변수와 인스턴스 변수를 사용하는 방식의 차이점 구분 예제
 */
public class CalculatorMain {
    public static void main(String[] args) {
        // 정적 변수는 클래스이름.변수명으로 접근
        double result1 = 10 * 10 * chap06_domain_class.src.com.javalab.sec08.Calculator.pi;
        // 정적 메소드는 클래스이름.메소드명으로 접근
        int result2 = chap06_domain_class.src.com.javalab.sec08.Calculator.plus(10, 5);
        // 정적 메소드는 클래스이름.메소드명으로 접근
        int result3 = chap06_domain_class.src.com.javalab.sec08.Calculator.minus(10, 5);

        // 인스턴스 멤버는 클래스 이름으로 접근 불가. 객체 생성해서 사용 가능
        // 인스턴스 변수는 객체를 생성하고 참조변수.변수명으로 접근, 클래스 이름으로 접근 불가
        //Calculator.color = "white"; // 컴파일 에러
        // 인스턴스 메소드는 객체를 생성하고 참조변수.메소드명으로 접근, 클래스 이름으로 접근 불가
        //Calculator.setColor("white"); // 컴파일 에러

        // Calculator 객체 생성
        Calculator cal = new Calculator();
        // 인스턴스 변수에 접근
        cal.color = "white";
        // 인스턴스 메소드에 접근
        cal.setColor("white");

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }
}