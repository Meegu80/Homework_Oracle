package com.javalab.sec13.package2;


import com.javalab.sec13.package1.A;

/**
 * 에이클래스와 다른 패키지에 존재
 * 에이 클래스의 퍼블릭 생성자에게만 접근 가능
 * 에이 클래스의 디폴트, 프리베이트 생성자는 접근 불가능
 *
 *
 */
class C {
    // A 클래스의 퍼블릭 생성자에게만 접근 가능
    A a1 = new A(true); // 퍼블릭 생성자
    A a2 = new A(1);// 디폴트 생성자, 접근 불가능
    A a3 = new A("문자열");//private 생성자는 접근 불가능




}
