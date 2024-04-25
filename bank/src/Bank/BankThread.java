package Bank;

class BankThread extends Thread{
    private SyncAccount sync;

    public BankThread(SyncAccount sync) {
        this.sync = sync;
    }
    @Override
    public void run() {
        boolean result = sync.withdraw(10000); //6000원 인출
        System.out.println("result =" +result+", balance ="+sync.getBalance());

    }

}