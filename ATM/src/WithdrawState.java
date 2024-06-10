public class WithdrawState extends ATMState {
    WithdrawProcessor withdrawProcessor;

    public WithdrawState() {
        System.out.println("Enter withdrawal amount: ");
        withdrawProcessor = new ThousandProcessor(new FiveHundredProcessor(new HundredProcessor(null)));
    }

    @Override
    public void withdrawAmount(ATM atm, double amount) {
        double balance = atm.getCardDetail().getAccount().getBalance();
        if(amount <= balance) {
            if(amount % 100 > 0) {
                System.out.println("ATM can only process withdrawal in multiple of 100s");
                return;
            }
            atm.getCardDetail().getAccount().setBalance(balance - amount);
            withdrawProcessor.withdraw(amount);
            System.out.println("Amount withdrawn " + amount);
        } else {
            System.out.println("Insufficient balance in account");
        }
        atm.changeState(new IdleState());
    }
}
