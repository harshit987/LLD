public class HundredProcessor extends WithdrawProcessor {
    public HundredProcessor(WithdrawProcessor nextWithdrawer) {
        super(nextWithdrawer);
    }

    @Override
    public void withdraw(double amount) {
        if(amount >= 100) {
            System.out.println("withdrawing " + (int) (amount / 100) + " notes of 100 denominator");
        }
    }
}