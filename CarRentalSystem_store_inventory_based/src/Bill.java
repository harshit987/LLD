public class Bill {
    Reservation reservation;
    boolean isPaid;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        isPaid = false;
    }

    public void recordPayment() {
        isPaid = true;
    }
}
