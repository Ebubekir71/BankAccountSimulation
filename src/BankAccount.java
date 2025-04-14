public class BankAccount {
    private int balance=100;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount >= balance) {
            System.out.println(Thread.currentThread().getName() + ": para cekiyor");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + ": cekiyor");
        }else{
            System.out.println(Thread.currentThread().getName() + ": yeterli bakiye yok. Mevcut bakiye :" + balance);
        }
    }
}
