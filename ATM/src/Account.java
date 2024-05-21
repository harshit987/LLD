public class Account {
    public Account(Long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    private Long accountNumber;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
