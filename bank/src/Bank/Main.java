package Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isExit = false;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("==========은행 고객들의 계좌관리 프로그램==========");
            System.out.println("1. 계좌등록");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 잔액조회");
            System.out.println("5. 전체 계좌 조회");
            System.out.println("6. 종료");
            System.out.println("메뉴를 선택해주세요.");

            int menu = scan.nextInt();
            switch (menu) {
                case 1: //계좌등록
                    createAccount();
                    break;
                case 2: // 입금
                    deposit();
                    break;
                case 3: // 출금
                    withdraw();
                    break;
                case 4: // 잔액조회
                    retrieveBalance();
                    break;
                case 5: //전체 계좌 조회
                    retrieveAccount();
                    break;
                case 6:
                    isExit = true;
                    break;
            }
        } while (!isExit);
    } //end of main

    static SyncAccount[] accounts = new SyncAccount[10];
    static int index = 0;

    public static void createAccount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("고유식별코드 : ");
        String bankId = scan.nextLine(); // 자동생성으로 바꿔야함

        System.out.println("계좌번호  : ");
        String account = scan.nextLine();

        System.out.println("이름 : ");
        String clientName = scan.nextLine();

        System.out.println("비밀번호 : ");
        int password = scan.nextInt(); //****으로 표기되게 바꿔야함

        System.out.println("잔액 : ");
        int balance = scan.nextInt();

        // 계좌 객체 생성 및 배열에 저장
        SyncAccount newAccount = new SyncAccount(bankId, clientName, account, password, balance);
        accounts[index++] = newAccount;
        System.out.println("계좌가 등록되었습니다.");
    }


    //입금 처리를 수행하는 메서드
    public synchronized void deposit(int money) {
        if (money > 0) {
            balance += money;
            System.out.println(amount + "원이 입금되었습니다.");
            System.out.println("현재 잔액: " + balance + "원");
        } else {
            System.out.println("입금할 금액은 0보다 커야 합니다.");
        }
    }


}