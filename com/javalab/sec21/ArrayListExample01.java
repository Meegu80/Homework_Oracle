package com.javalab.sec21;

import java.util.ArrayList;

/**
 * ArrayList 예제
 * - ArrayList는 배열과 비슷하지만 크기를 변경할 수 있는 배열이다.
 * - ArrayList 객체 생성시점에 저장할 객체의 타입을 지정할 수 있다.
 * - ArrayList에 객체를 추가할 때는 add() 메소드를 사용
 * - ArrayList에 저장된 객체를 가져올 때는 get(인덱스) 메소드를 사용
 * - ArrayList에 저장된 객체의 개수는 size() 메소드로 알 수 있다.
 * - ArrayList에 저장할 객체를 설정할 때는 반드시 객체의 타입을 지정해야 한다.
 */
public class ArrayListExample01 {
    public static void main(String[] args) {
        // String Type을 저장할 수 있는 ArrayList 객체 생성
        //ArrayList<String> stringList = new ArrayList<String>();

        int[] array = new int[5]; // int 값 5개 저장하는 배열
        String[] strArray = new String[10]; // 10칸짜리 문자열 변수를 저장할 수 있는 배열

        Person[] pArray = new Person[3]; // 3칸짜리 Person 객체를 저장할 수 있는 배열
        pArray[0] = new Person("Alice", 20);
        pArray[1] = new Person("Bob", 30);
        pArray[2] = new Person("Chris", 40);
        for(Person p: pArray){
            System.out.println(p.getName() + " : " + p.getAge());
        }

        // Person 객체를 저장할 수 있는 ArrayList 객체 생성
        // Person Type 객체 이외에는 아무것도 담을 수 없다.오직 Person 객체만 저장된다.
        ArrayList<Person> personList = new ArrayList<Person>();
        Person p1 = new Person("Alice", 20);
        Person p2 = new Person("Bob", 30);
        Person p3 = new Person("Chris", 40);

        // ArrayList에 객체 추가
        personList.add(p1); // p1 객체를 personList에 추가
        personList.add(p2); // p1 객체를 personList에 추가
        personList.add(p3); // p1 객체를 personList에 추가

        // ArrayList 출력
        for(Person p: personList){
            System.out.println(p.getName() + " : " + p.getAge());
        }

        // 첫번째 Person 객체 추력
        System.out.println("personList의 첫번째 객체 : "
                + personList.get(0).getName()
                + " " + personList.get(0).getAge());
        System.out.println("personList의 두번째 객체 : ");
        System.out.println(personList.get(1).getName() + " "
                + personList.get(1).getAge());

        Person[] pArray2 = new Person[3];
        pArray2[0] = new Person("Alice", 20);
        pArray2[1] = new Person("Bob", 30);
        pArray2[2] = new Person("Chris", 40);
        System.out.println("배열의 첫번째 요소");
        System.out.println(pArray2[1].getName() + " " + pArray2[0].getAge());

        // Employee 객체를 저장할 수 있는 ArrayList 객체 생성
        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        Employee e1 = new Employee(201,"Alice","사원",3000);
        Employee e2 = new Employee(202,"Sujan","대리",4000);
        Employee e3 = new Employee(203,"Mina","과장",5000);

        // ArrayList에 객체 추가
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        // 추가한 사원 객체의 사번, 사원명, 직급, 급여를 출력합니다.
        System.out.println(employeeList.get(0).getEmployeeId());

    }
}

/**
 * Person 클래스
 * - 이름, 나이를 저장하는 클래스
 */
class Person{
    public String name;
    public int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
} // end of Person class

class Employee{
    private int employeeId;
    private String name;
    private String position;
    private int salary;

    public Employee(){
    }
    public Employee(int employeeId, String name, String position, int salary){
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    // Getter
    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public int getSalary() {
        return salary;
    }


}