package chap06_domain_class.src.com.javalab.sec08;


public class TelevisionMain {
    // 인스턴스 멤버 변수 선언
    int a;
    // 정적 메소드
    // 정적 메소드에서 자신이 포함된 클래스의 인스턴스 변수에
    // 접근하려면 반드시 객체를 생성해야 함.

    public static void main(String[] args) {
        System.out.println(Television.info);
//        a = 10; 이렇게하면 에러가 뜨니깐 아래와 같이 돌아가서 써야하는 것이다
        TelevisionMain tm = new TelevisionMain();
        tm.a = 10;
    }
    public  void accessA(){
        a = 10;

    }
}

