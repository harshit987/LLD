public class ThousandProcessor extends WithdrawProcessor {

    public ThousandProcessor(WithdrawProcessor nextWithdrawer) {
        super(nextWithdrawer);
    }

    @Override
    public void withdraw(double amount) {
        if(amount >= 1000) {
            System.out.println("withdrawing " + (int)(amount/1000) + " notes of 1000 denominator");
        }
        if(amount % 1000 != 0) {
            nextWithdrawer.withdraw(amount%1000);
        }
    }
}
