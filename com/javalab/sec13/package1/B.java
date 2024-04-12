public class Car {
    private String name;
    private String color;
    private int currentSpeed;

    // 기본 생성자 - 매개변수가 없다.
    public Car() {
    }

    // 속도 변경 메소드
    public void changeSpeed(int currentSpeed) {
        if (currentSpeed < 0) {
            System.out.println("속도는 음수가 될 수 없습니다. ");
            return;
        } else {
            this.currentSpeed = currentSpeed;
        }
    }

    // 현재 속도를 알려주는 메소드
    public void getCurrentSpeed() {
        System.out.println("현재 속도는 " + currentSpeed + "입니다.");
    }
}


