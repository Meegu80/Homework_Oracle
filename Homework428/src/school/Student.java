package school;

public class Student {

    private String id;			//학번
    private String jumin; 		//주민번호
    private String name; 		//이름
    private int year;			//학년
    private String address;		//주소
    private int department;		//학과code

    //기본 생성자
    public Student() {
    }

    //오버로딩 생성자		printStudent(students);
    public Student(String id, String jumin, String name, int year, String address, int department) {
        this.id = id;
        this.jumin = jumin;
        this.name = name;
        this.year = year;
        this.address = address;
        this.department = department;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getJumin() {
        return jumin;
    }
    public void setJumin(String jumin) {
        this.jumin = jumin;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
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
    // toString() 오버라이딩
}
