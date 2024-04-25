package chap06_domain_class.src.com.javalab.sec08;

/**
 * 정적 변수와 정적 초기화 블록
 * - 정적 변수는 클래스가 메모리에 로딩될 때 생성되어 프로그램이 종료될 때까지 유지됨
 * - 정적 변수는 클래스 이름으로 직접 접근 가능
 * - 정적 초기화 블록은 정적 변수를 초기화하는 블록
 * - 정적 초기화 블록은 클래스가 메모리에 로딩될 때 실행됨. 단 한번만 실행됨
 */
public class Television {
    static String company = "Samsung";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }
}