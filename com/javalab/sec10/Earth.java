package chap06_domain_class.src.com.javalab.sec10;

/**
 * 상수
 * 상수는 변하지 않는 값이다.
 * 상수는 final 키워드를 사용하여 선언한다.
 * 상수는 선언과 동시에 초기화하거나 생성자에서 초기화 하거나 static 블록을 이용하여 초기화한다.
 * 상수는 대문자로 작성하며, 여러 단어일 경우 _로 구분한다.
 * 상수는 static 키워드를 사용하여 클래스 변수로 선언한다
 * 상수는
 */

public class Earth {
    static final double EARTH_RADIUS = 6400; //   지구의 반지름
    static final double EARTH_SURFACED_AREA; //   지구의 표면적반지름

            // STATIC 블록을 이용한 상수 초기화
    static {
        EARTH_SURFACED_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
            }

}
