package com.javalab.sec01;

public class Human {
    // 필드(속성) : 정보 저장공간, human 이 가질 수 있는 성질
    String ssn;
    String name;
    int age;

    //생성자
    public Human(){

        System.out.println("여기는 Human 클래스 생성자");
    }

    // 추가 생성자(생성자 오버로딩 : 같은 이름의 생성자)
    public Human(String ssn, String name, int age){ //이줄의 ssn은 아래줄의 오른쪽 것이다

        ssn = ssn; // 이렇게 하면 컴파일러가 구분 못한다, 컴파일러는 파라미터 ssn(오른쪽꺼)을 우선한다.
//        name = name;
//        age = age;
        // 아래와 같이 수정한다

        this.ssn = ssn;
        this.name = name;
        this.age = age;

    }

}
