public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("current account deposit");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("current account withdraw");
    }

}
