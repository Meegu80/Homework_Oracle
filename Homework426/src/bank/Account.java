package bank;

public class Account {
    private String accountNumber;
    private String customerName;
    private int balance;
    private int uniqueID;
    private int password;

    public Account(String accountNumber, String customerName, int balance, int uniqueID, int password) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.uniqueID = uniqueID;
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getBalance() {
        return balance;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public boolean checkPassword(int inputPassword) {
        return password == inputPassword;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + balance + "원");
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + balance + "원");
        }
    }

    public synchronized void transfer(Account recipient, int amount) {
        if (balance >= amount) {
            balance -= amount;
            recipient.deposit(amount);
            System.out.println(amount + "원을 " + recipient.getCustomerName() + "님께 이체했습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + balance + "원");
        }

    }

    // 특정 계좌의 모든 필드값 출력
    public void printAccountDetails() {
        System.out.println("고유번호: " + uniqueID);
        System.out.println("계좌 번호: " + accountNumber);
        System.out.println("고객 이름: " + customerName);
        System.out.println("잔액: " + balance + "원");
    }
}
