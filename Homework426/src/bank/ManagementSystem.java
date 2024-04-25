package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementSystem {
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 두 개의 계좌 생성 및 ArrayList에 추가
        accounts.add(new Account("111-222", "뉴진스", 5000000,1234, 1111));
        accounts.add(new Account("999-000", "민희진", 100000, 5678, 2222));

        boolean exit = false;
        while (!exit) {
            System.out.println("\n=========== 은행 관리 프로그램 ===========");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 이체");
            System.out.println("5. 전체 계좌 조회");
            System.out.println("6. 특정 계좌 조회");
            System.out.println("7. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // 버퍼 비우기
            System.out.println("==========================================");

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    showAllAccounts();
                    break;
                case 6:
                    showAccountDetails();
                    break;
                case 7:
                    exit = true;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("고유번호: ");
        int uniqueID = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기
        System.out.print("비밀번호: ");
        int password = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기
        System.out.print("계좌번호: ");
        String accountNumber = scanner.nextLine();
        System.out.print("고객이름: ");
        String customerName = scanner.nextLine();
        System.out.print("첫 입금액: ");
        int initialDeposit = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기

        Account account = new Account(accountNumber, customerName, initialDeposit, uniqueID, password);
        accounts.add(account);
        System.out.println("계좌가 생성되었습니다.");
    }

    private static Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    private static void deposit() {
        System.out.print("계좌 번호: ");
        String accountNumber = scanner.nextLine();
        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.print("비밀번호: ");
            int password = scanner.nextInt();
            scanner.nextLine();  // 버퍼 비우기
            if (account.checkPassword(password)) {
                System.out.print("입금액: ");
                int amount = scanner.nextInt();
                account.deposit(amount);
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("해당 계좌를 찾을 수 없습니다.");
        }
    }

    private static void withdraw() {
        System.out.print("계좌 번호: ");
        String accountNumber = scanner.nextLine();
        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.print("비밀번호: ");
            int password = scanner.nextInt();
            scanner.nextLine();  // 버퍼 비우기
            if (account.checkPassword(password)) {
                System.out.print("출금액: ");
                int amount = scanner.nextInt();
                account.withdraw(amount);
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("해당 계좌를 찾을 수 없습니다.");
        }
    }

    private static void transfer() {
        System.out.print("보내는 계좌 번호: ");
        String senderAccountNumber = scanner.nextLine();
        Account senderAccount = findAccount(senderAccountNumber);
        if (senderAccount != null) {
            System.out.print("비밀번호: ");
            int password = scanner.nextInt();
            scanner.nextLine();  // 버퍼 비우기
            if (senderAccount.checkPassword(password)) {
                System.out.print("받는 계좌 번호: ");
                String recipientAccountNumber = scanner.nextLine();
                Account recipientAccount = findAccount(recipientAccountNumber);
                if (recipientAccount != null) {
                    System.out.print("이체액: ");
                    int amount = scanner.nextInt();
                    senderAccount.transfer(recipientAccount, amount);
                } else {
                    System.out.println("받는 계좌를 찾을 수 없습니다.");
                }
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("보내는 계좌를 찾을 수 없습니다.");
        }
    }

    private static void showAllAccounts() {
        System.out.println("\n=== 전체 계좌 목록 ===");
        for (Account account : accounts) {
            System.out.println("고유번호: " + account.getUniqueID() +
                    ", 계좌번호: " + account.getAccountNumber() +
                    ", 고객이름: " + account.getCustomerName() +
                    ", 잔액: " + account.getBalance() + "원");
        }
    }

    // 특정 계좌 조회 메소드
    private static void showAccountDetails() {
        System.out.print("조회할 계좌의 계좌번호를 입력하세요: ");
        String accountNumber = scanner.nextLine();

        Account foundAccount = null;
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                foundAccount = account;
                break;
            }
        }

        if (foundAccount != null) {
            foundAccount.printAccountDetails();
        } else {
            System.out.println("해당 계좌번호를 가진 계좌를 찾을 수 없습니다.");
        }
    }
}

