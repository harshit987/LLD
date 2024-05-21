public class EnterPinState extends ATMState {
    public void checkPin(ATM atm, CardDetail cardDetail, Integer pin) {
        if(cardDetail.isCorrectPin(pin)) {
            System.out.println("Pin authenticated");
            atm.changeState(new OperationSelectionState());
        } else {
            System.out.println("Pin not correct");
            atm.setCardDetail(null);
            atm.changeState(new IdleState());
        }
    }
}
