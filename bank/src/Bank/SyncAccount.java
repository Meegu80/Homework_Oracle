package Bank;

class SyncAccount{
    private String bankId;      //식별코드
    private String clientName;  //계좌주
    private String account;     //계좌번호
    private int password;       //비밀번호
    private int balance;        //잔액이 저장될 변수

    public SyncAccount() {
    }

    public SyncAccount(String bankId, String clientName, String account, int password, int balance) {
        this.bankId = bankId;
        this.clientName = clientName;
        this.account = account;
        this.password = password;
        this.balance = balance;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }




    //출금을 처리하는 메서드(출금성공 : true, 출금실패 : false반환)
    //동기화 영역에서 호출하는 메서드도 동기화 처리를 해 주어야 한다.
    synchronized public boolean withdraw(int money) {
        if(balance >= money) {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
            balance -= money;
            System.out.println("balance = "+getBalance());
            return true;
        }else {
            return false;
        }
    }
}