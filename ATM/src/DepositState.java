public class DepositState extends ATMState {
    @Override
    public void depositAmount(ATM atm, double amount) {
        double balance = atm.getCardDetail().getAccount().getBalance();
        atm.getCardDetail().getAccount().setBalance(balance + amount);
        System.out.println("Amount " + amount + " deposited to the account number " +
            atm.getCardDetail().getAccount().getAccountNumber());
        atm.changeState(new IdleState());
    }
}
