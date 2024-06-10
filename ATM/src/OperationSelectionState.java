public class OperationSelectionState extends ATMState {

    public OperationSelectionState() {
        System.out.println("Select one of the operations: ");
    }

    @Override
    public void selectOperation(ATM atm, OperationType operationType) {
        switch(operationType) {
            case WITHDRAWAL:
                atm.changeState(new WithdrawState());
                break;
            case DEPOSIT:
                atm.changeState(new DepositState());
                break;
            case CHECK_BALANCE:
                double balance = atm.getCardDetail().getAccount().getBalance();
                System.out.println("Current balance for the account is " + balance);
                atm.changeState(new IdleState());
                break;
            default:
                throw new RuntimeException("Unknown operation selected");
        }
    }
}
