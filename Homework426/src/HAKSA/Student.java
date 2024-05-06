package HAKSA;

public class Student {

    private String id;             // 학번
    private String juminbunho;     //주민번호
    private String name;           //이름
    private int grade ;            //학년
    private String address;        //주소
    private int department;        // 학과 코드

    public Student() {
    }

    public Student(String id, String juminbunho, String name, int grade, String address, int department) {
        this.id = id;
        this.juminbunho = juminbunho;
        this.name = name;
        this.grade = grade;
        this.address = address;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJuminbunho() {
        return juminbunho;
    }

    public void setJuminbunho(String juminbunho) {
        this.juminbunho = juminbunho;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
}
