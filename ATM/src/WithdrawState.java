public class WithdrawState extends ATMState {

    public WithdrawState() {
        System.out.println("Enter withdrawal amount: ");
    }

    @Override
    public void withdrawAmount(ATM atm, double amount) {
        double balance = atm.getCardDetail().getAccount().getBalance();
        if(amount < balance) {
            atm.getCardDetail().getAccount().setBalance(balance - amount);
            System.out.println("Amount withdrawn " + amount);
        } else {
            System.out.println("Insufficient balance in account");
        }
        atm.changeState(new IdleState());
    }
}
