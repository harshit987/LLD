public class CardDetail {
    private Account account;
    private String userName;
    private Integer pin;

    public CardDetail(Account account, String userName, Integer pin) {
        this.account = account;
        this.userName = userName;
        this.pin = pin;
    }

    public boolean isCorrectPin(Integer pin) {
        if(pin == this.pin)
            return true;
        else return false;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
