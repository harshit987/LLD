import java.lang.IllegalStateException;
public abstract class ATMState {
    /**
     *
     * steps:-
     * 1. Insert card
     * 2. options - withdraw/ check balance
     * * 3.1 provide pin
     * * 3.2 pin validation
     *
     * 3.a provide withdraw amount
     * 3.b Amount check if yes -> withdraw else return to start and ask to remove card
     * 3.c withdraw

     * 3.3
     */
    public void insertCard(ATM atm, CardDetail cardDetail) {
        throw new IllegalStateException("Can't insert card");
    }
    public void selectOperation(ATM atm, OperationType operationType) {
        throw new IllegalStateException("Can't select operation type");
    }
    public void withdrawAmount(ATM atm, double amount) {
        throw new IllegalStateException("can't select withdraw amount");
    }

    public void depositAmount(ATM atm, double amount) {
        throw new IllegalStateException("can't select deposit amount");
    }

    public void checkPin(ATM atm, CardDetail cardDetail, Integer pin) {
        throw new IllegalStateException("can't enter pin");
    }

    public void checkBalance(ATM atm) {
        throw new IllegalStateException("can't check balance");
    }
}
