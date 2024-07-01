public class Payment {
    Bill bill;

    public Payment(Bill bill) {
        this.bill = bill;
    }

    public void makePayment() {
        // Record payment details
        // update bill status to "paid"
        bill.recordPayment();
    }
}
