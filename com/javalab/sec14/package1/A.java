package chap06_domain_class.src.com.javalab.sec14.package1;

/**
 * 필드(속성, 변수)와 메소드의 접근 제한 예제
 */
public class A {
    // 인스턴스 필드(속서, 변수)
    public int field1;
    int field2;
    private int field3;

    // 생성자
    public A(){
        field1 = 1;
        field2 = 2;
        field3 = 3;
        method1();
        method2();
        method3();
    }

    // 인스턴스 메소드 - public 접근 제한
    public void method1() {
        System.out.println("A.method1() 호출됨");
    }

    // 인스턴스 메소드 - default(같은 클래스접근) 접근 제한
    public void method2() {
        System.out.println("A.method2() 호출됨");
    }

    // 인스턴스 메소드 - private 접근 제한
    public void method3() {
        System.out.println("A.method3() 호출됨");
    }
}
