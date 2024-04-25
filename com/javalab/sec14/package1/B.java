package chap06_domain_class.src.com.javalab.sec14.package1;

/**
 * 필드(속성, 변수)와 메소드의 접근 제한 예제
 * 에이클래스와 비클래스는 동일한 패키지에 속해 있음
 * 에이클래스의 디폴트, 퍼블릭 접근 제한이 있는 필드, 메소드에 접근가능
 */
public class B {
    public static void main(String[] args) {
        A a = new A();
        a.field1 = 1;
        a.field2 = 2;
        // a.field3 = 3;  private여서 접근불가
        a.method1();
        a.method2();
//        a.method3(); // private 메소드 접근 불가


    }
}
