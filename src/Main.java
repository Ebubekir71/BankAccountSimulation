public class Main {
    public static void main(String[] args) {
        BankAccount ortakHesap = new BankAccount();

        Thread t1 = new Thread(new WithdrawTask(ortakHesap), "Thread-1");
        Thread t2 = new Thread(new WithdrawTask(ortakHesap), "Thread-2");

        t1.start();
        t2.start();
    }
}