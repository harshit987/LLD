public class IdleState extends ATMState {

    public IdleState() {
        System.out.println("ATM is available now for next request");
    }
    @Override
    public void insertCard(ATM atm, CardDetail cardDetail) {
        System.out.println("Card Inserted");
        atm.setCardDetail(cardDetail);
        atm.changeState(new EnterPinState());
    }
}
