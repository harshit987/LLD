// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account = new Account(12345678L, 1000);
        CardDetail cardDetail = new CardDetail(account, "harshit", 1234);
        atm.insertCard(cardDetail);
        atm.checkPin(1234);
        atm.selectOperation(OperationType.WITHDRAWAL);
        atm.withdrawAmount(700);
        System.out.println(account.getBalance());
    }
}