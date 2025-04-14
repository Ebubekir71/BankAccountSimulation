public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Thread t1 = new Thread(new WithdrawTask(ortakHesap), "Thread-1");
    }
}