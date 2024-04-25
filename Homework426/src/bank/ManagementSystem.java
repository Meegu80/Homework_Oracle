package bank;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagementSystem {
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        accounts.add(new Account("111-222", "뉴진스", 5000000, 1234, 1111));
        accounts.add(new Account("999-000", "민희진", 100000, 5678, 2222));

        boolean exit = false;
        while (!exit) {
            System.out.println("\n======= 은행 관리 프로그램 =======");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 이체");
            System.out.println("5. 전체 계좌 조회");
            System.out.println("6. 계좌 조회");
            System.out.println("7. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // 버퍼 비우기

            switch (choice) {
                case 1:
                    createAccount();
                    printCurrentTime();
                    break;
                case 2:
                    deposit();
                    printCurrentTime();
                    break;
                case 3:
                    withdraw();
                    printCurrentTime();
                    break;
                case 4:
                    transfer();
                    printCurrentTime();
                    break;
                case 5:
                    showAllAccounts();
                    printCurrentTime();
                    break;
                case 6:
                    showAccountDetails();
                    printCurrentTime();
                    break;
                case 7:
                    exit = true;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("올바른 선택 번호를 입력하세요.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("고객 이름을 입력하세요: ");
        String customerName = scanner.nextLine();
        System.out.print("계좌 번호를 입력하세요: ");
        String accountNumber = scanner.nextLine();
        System.out.print("잔액을 입력하세요: ");
        int balance = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기
        System.out.print("비밀번호를 입력하세요: ");
        int password = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기

        System.out.println("1. 저축 계좌");
        System.out.println("2. 신용 계좌");
        System.out.print("계좌 유형을 선택하세요: ");
        int accountType = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기

        System.out.print("고유 ID를 입력하세요: ");
        int uniqueID = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기

        if (accountType == 1) {
            accounts.add(new SavingsAccount(accountNumber, customerName, balance, password, uniqueID));
        } else if (accountType == 2) {
            accounts.add(new CreditAccount(accountNumber, customerName, balance, password, uniqueID));
        } else {
            System.out.println("올바른 계좌 유형을 선택하세요.");
        }
    }

    private static void deposit() {
        System.out.print("입금할 계좌번호를 입력하세요: ");
        String accountNumber = scanner.nextLine();
        System.out.print("입금할 금액을 입력하세요: ");
        int amount = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기

        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("해당 계좌를 찾을 수 없습니다.");
        }
    }

    private static void withdraw() {
        System.out.print("출금할 계좌번호를 입력하세요: ");
        String accountNumber = scanner.nextLine();
        System.out.print("출금할 금액을 입력하세요: ");
        int amount = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기

        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("해당 계좌를 찾을 수 없거나 잘못된 비밀번호입니다.");
        }
    }

    private static void transfer() {
        System.out.print("이체할 송금 계좌번호를 입력하세요: ");
        String senderAccountNumber = scanner.nextLine();
        System.out.print("이체할 수신 계좌번호를 입력하세요: ");
        String recipientAccountNumber = scanner.nextLine();
        System.out.print("이체할 금액을 입력하세요: ");
        int amount = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기

        Account senderAccount = findAccount(senderAccountNumber);
        Account recipientAccount = findAccount(recipientAccountNumber);

        if (senderAccount != null && recipientAccount != null) {
            senderAccount.transfer(recipientAccount, amount);
        } else {
            System.out.println("송금 또는 수신 계좌를 찾을 수 없습니다.");
        }
    }

    private static void showAllAccounts() {
        System.out.println("\n=== 전체 계좌 목록 ===");
        for (Account account : accounts) {
            System.out.println("고객 이름: " + account.getCustomerName());
            System.out.println("계좌 번호: " + account.getAccountNumber());
            System.out.println("잔액: " + account.getBalance() + "원");
            System.out.println("고유 ID: " + account.getUniqueID());
            System.out.println();
        }
    }

    private static void showAccountDetails() {
        System.out.print("조회할 계좌번호를 입력하세요: ");
        String accountNumber = scanner.nextLine();

        Account account = findAccount(accountNumber);
        if (account != null) {
            account.printAccountDetails();
        } else {
            System.out.println("해당 계좌를 찾을 수 없습니다.");
        }
    }

    private static Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

        public static void printCurrentTime() {
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedTime = currentTime.format(formatter);
            System.out.println(formattedTime);
            System.out.println("===============================");

        }

}