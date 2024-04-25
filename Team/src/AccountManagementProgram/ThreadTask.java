package AccountManagementProgram;

// ThreadTask 클래스는 Runnable 인터페이스를 구현합니다.
class ThreadTask implements Runnable {
    // private로 선언된 Account 객체를 생성합니다. 초기 잔고는 2000입니다.
    private Account account = new Account(1300);

    // Runnable 인터페이스의 run 메서드를 구현합니다.
    @Override
    public void run() {
        // 계좌 잔고가 0보다 클 때까지 반복합니다.
        while (account.getBalance() > 0) {
            // 100부터 300까지의 랜덤한 금액을 생성하여 money 변수에 저장합니다.
            int money = (int)((Math.random() * 3) + 1) * 100;
            // Account 클래스의 withDraw 메서드를 호출하여 계좌에서 money만큼 출금합니다.
            account.withDraw(money);
        }
    }
}