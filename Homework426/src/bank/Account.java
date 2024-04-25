package bank;

public class Account {
    private String accountNumber;
    private String customerName;
    private int balance;
    private int password;
    private int uniqueID;

    public Account() {
    }
    public Account(String accountNumber, String customerName, int balance, int password, int uniqueID) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.password = password;
        this.uniqueID = uniqueID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
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

    public void printAccountDetails() {
        System.out.println("고객 이름: " + customerName);
        System.out.println("계좌 번호: " + accountNumber);
        System.out.println("잔액: " + balance + "원");
        System.out.println("고유 ID: " + uniqueID);
    }
}