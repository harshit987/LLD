public class FiveHundredProcessor extends WithdrawProcessor {
    public FiveHundredProcessor(WithdrawProcessor nextWithdrawer) {
        super(nextWithdrawer);
    }

    @Override
    public void withdraw(double amount) {
        if(amount >= 500) {
            System.out.println("withdrawing " + (int)(amount/500) + " notes of 500 denominator");
        }
        if(amount % 500 > 0) {
            nextWithdrawer.withdraw(amount % 500);
        }
    }
}
