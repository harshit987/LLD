// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account = new Account(12345678L, 3800);
        CardDetail cardDetail = new CardDetail(account, "harshit", 1234);

        // ------- Withdrawal---------
        atm.insertCard(cardDetail);
        atm.checkPin(1234);
        atm.selectOperation(OperationType.WITHDRAWAL);
        atm.withdrawAmount(3800);
        System.out.println("balance in the inserted card's account " + account.getBalance());

        // -------- Check balance --------
        atm.insertCard(cardDetail);
        atm.checkPin(1234);
        atm.selectOperation(OperationType.CHECK_BALANCE);

        // -------- Deposit amount -----------
        atm.insertCard(cardDetail);
        atm.checkPin(1234);
        atm.selectOperation(OperationType.DEPOSIT);
        atm.depositAmount(3800);
        System.out.println("balance in the inserted card's account " + account.getBalance());
    }
}