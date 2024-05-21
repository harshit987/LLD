public class CheckBalanceState extends ATMState {
    public CheckBalanceState(ATM atm) {
        double balance = atm.getCardDetail().getAccount().getBalance();
        System.out.println("Current balance for the account is " + balance);
        atm.changeState(new IdleState());
    }
}
