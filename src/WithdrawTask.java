public class WithdrawTask implements Runnable {
    private BankAccount bankAccount;

    public WithdrawTask(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            bankAccount.withdraw(40);
        }
    }
}
