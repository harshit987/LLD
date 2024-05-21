public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, CardDetail cardDetail) {
        System.out.println("Card Inserted");
        atm.setCardDetail(cardDetail);
        atm.changeState(new EnterPinState());
    }
}
