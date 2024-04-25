package chap06_domain_class.src.com.javalab.sec08;

/**
 * 원의 넓이를 구해주는 도메인 클래스
 * - 정적변수 PI를 갖고 있다.
 * - 원의 넓이를 계산하는 메소드를 갖고 있다.
 * - 원의 반지름을 인자로 받아 넓이를 계산한다.
 * - 정적 변수는 객체 소속이 아니고 클래스 소속이다.
 * - 객체 생성시 객체에 메모리 공간이 만들어지지 않는다.
 * - 해당 클래스가 메모리에 로딩과 동시에 사용가능하며 클래스 이름으로 접근한다.
 */
public class Circle {
    // 정적 멤버 변수로 PI 선언
    public static final double PI = 3.14159;

    // 인스턴스 메소드로 원의 넓이 계산
    public double calculateArea(double radius) {
        // 인스턴스 변수로 원의 반지름 선언
        return PI * radius * radius;
    }
}