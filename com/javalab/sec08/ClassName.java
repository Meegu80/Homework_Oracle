package chap06_domain_class.src.com.javalab.sec08;

public class ClassName {
    // 인스턴스 멤버(필드, 메소드)
    int field1;
    void method1() {
        field1 = 15;
    }

    // 정적 멤버(필드, 메소드)
    static int field2;
    static void method2() {
        field2 = 20;
    }

    // 정적 블록 - 정적 멤버 초기화
    static {
        //field1 = 30;    // 에러 발생, 정적 블록에서 인스턴스 변수 접근 안됨.
        //method1();    // 에러 발생, 정적 블록에서 인스턴스 메소드 접근 안됨.

        ClassName cn = new ClassName(); // 객체 생성
        cn.field1 = 30; // 정적 블록에서 해당 객체의 변수 접근 가능
        cn.method1();

        field2 = 40; // 정적 블록에서 정적 변수 접근 가능
        method2();    // 정적 블록에서 정적 메소드 접근 가능
    }
}