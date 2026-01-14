public class SavingAccount extends BankAccount {

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposit: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("withdraw: " + amount);
    }

}
