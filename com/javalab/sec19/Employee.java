package chap06_domain_class.src.com.javalab.sec19;

/**
 * 사원 도메인 클래스
 * - 속성(멤버변수) : 직원id, 직원명, 직급명, 급여
 */
public class Employee {
    // 1. 필드, 속성, 멤버변수
    private int employeeId; // 직원id
    private String name; // 직원명
    private String position; // 직급명
    private int salary; // 급여

    // 2. 기본생성, 파라미터가 없는 생성자
    public Employee(){
    }
    // 3. 생성자, 파라미터가 있는 생성자
    public Employee(int employeeId, String name, String position, int salary){
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 4. getter, setter 메서드
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}