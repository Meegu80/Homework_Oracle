package chap06_domain_class.src.com.javalab.sec09;
/**
 * final 필드
 * final 필드는 한 번만 값을 저장할 수 있는 필드이다.
 * 초기화 이후에는 값을 변경할 수 없다.
 */
public class Korean {
    final String nation = "대한민국";
    String name;

    public Korean(String name){
        this.name = name;
    }
}
