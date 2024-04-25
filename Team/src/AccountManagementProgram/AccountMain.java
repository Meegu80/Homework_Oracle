package AccountManagementProgram;

import java.util.ArrayList;

public class AccountMain {
    public static void main(String[] args) {


        //출금 메소드 싱크로나이즈드
        ThreadTask threadTask = new ThreadTask();
        Thread customer1 = new Thread(threadTask);
        Thread customer2 = new Thread(threadTask);

        customer1.start();
        customer2.start();





    }
}

//================================================================================================
/*
Account account = new Account();

// ArrayList 생성
ArrayList<Account> accountList = new ArrayList<>();
*/

/*
// 첫 번째 통장 개설
Account account1 = new Account();
        account1.init("장동건", "1111-21-8888", 1000);
        account1.deposit(9000);
        account1.withdraw(5000);

// 두 번째 통장 개설
Account account2 = new Account();
*/

     //   account2.init("정우성", "123-45-67890", 900000);

// Account 객체 추가
        //accountList.add(account1);
        //accountList.add(account2);