public abstract class WithdrawProcessor {
    protected WithdrawProcessor nextWithdrawer;

    public WithdrawProcessor(WithdrawProcessor nextWithdrawer) {
        this.nextWithdrawer = nextWithdrawer;
    }
    public void withdraw(double amount) {
        if(nextWithdrawer != null) {
            nextWithdrawer.withdraw(amount);
        }
    }
}
