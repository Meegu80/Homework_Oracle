package bank;
public class CreditAccount extends Account {
    // CreditAccount 클래스는 Account 클래스를 상속받아서 만들어진 신용 계좌를 나타냅니다.

    public CreditAccount(String accountNumber, String customerName, int balance, int password, int uniqueID) {
        super(accountNumber, customerName, balance, password, uniqueID);
    }

    // 신용 계좌에서의 출금 메서드
    @Override
    public synchronized void withdraw(int amount) {
        if (getBalance() >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}