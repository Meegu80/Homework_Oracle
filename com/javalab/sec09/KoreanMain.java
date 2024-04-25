package chap06_domain_class.src.com.javalab.sec09;

public class KoreanMain {
    public static void main(String[] args) {
        Korean korean = new Korean("박찬호");
        System.out.println("국적 : "+ korean.nation);
        System.out.println("이름 : "+ korean.name);
    }
}
