import java.util.Map;

public class ATM {

    Map<Integer, Account> idToAccountMap;
    ATMState atmState;
    CardDetail currCardDetail;

    public void setCardDetail(CardDetail cardDetail) {
        this.currCardDetail = cardDetail;
    }

    public CardDetail getCardDetail() {
        return currCardDetail;
    }

    public ATM() {
        atmState = new IdleState();
        currCardDetail = null;
    }

    public void insertCard(CardDetail cardDetail) {
        atmState.insertCard(this, cardDetail);
    }
    public void selectOperation(OperationType operationType) {
        atmState.selectOperation(this, operationType);
    }
    public void withdrawAmount(double amount) {
        atmState.withdrawAmount(this, amount);
    }

    public void depositAmount(double amount) {
        atmState.depositAmount(this, amount);
    }

    public void checkPin(Integer pin) {
        atmState.checkPin(this, currCardDetail, pin);
    }
    public void changeState(ATMState atmState) {
        this.atmState = atmState;
    }
}
