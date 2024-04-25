package AccountManagementProgram;
/*
시나리오] 은행계좌를 추상화 해보자
맴버변수 : 예금주(name)
계좌번호(accountNumber)
잔고(balance)
맴버메소드 : 입금하다(deposit())
출금하다(withdraw())
계좌잔고 출력하기(showAccount())

조건1 : 입금은 무제한으로 가능함
조건2: 잔고가 부족할 경우에은 출금불능 처리

*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Account {
    private String accountNumber; // 계좌번호
    private String name; //계좌주인
    private int balance; // 잔액

    public Account() {
    }

    public Account(String accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    void deposit(int money) {
        if (money > 0) {    // 마이너스 입력을 했을 때 입급되어 지면 안되니깐 조건을 겁니다.
            balance += money;
            System.out.println(money + "원이 입금되었습니다.");
            System.out.println("현재 잔액은 " + balance + "원 입니다.");
            LocalDateTime now = LocalDateTime.now();
            String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
            System.out.println(formatedNow);
            System.out.println("====================================");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    void withdraw(int money) {
        // 출금을 위해 잔고와 출금액을 비교해서 처리함
        if (balance >= money) { // 잔고가 요청액보다 많은 경우에만 출금이 실행됩니다
            balance -= money;
            System.out.println("계좌에서 " + money + "원을 출금합니다.");
            System.out.println("현재 잔액은 " + balance + "원 입니다.");
            System.out.println("====================================");
        } else {
            System.out.println("현재 잔액이 부족합니다. ");
            System.out.println("====================================");
        }
    }

    //계좌 조회
    void showAccount() {
        System.out.println("계좌주 : " + name);
        System.out.println("계좌번호 : " + accountNumber);
        System.out.println("잔액 : " + balance + " 원");
        LocalDateTime now = LocalDateTime.now();
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
        System.out.println(formatedNow);
    }

    // 현재 계좌 상태 출력
/*
    void realAccount(String accountNumber) {
        System.out.println("계좌 " + accountNumber + " 의 잔액은 " + balance + " 원 입니다.");
    }
*/

    //계좌 초기화 메소드
    void init(String n, String a, int b) {
        name = n;
        accountNumber = a;
        balance = b;
    }


}

