public class Ticket {
    private int slotNo;
    private long bookingTimeInMillis;
    private String vehicleNo;

    public Ticket(int slotNo, long bookingTimeInMillis, String vehicleNo) {
        this.slotNo = slotNo;
        this.bookingTimeInMillis = bookingTimeInMillis;
        this.vehicleNo = vehicleNo;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public long getBookingTimeInMillis() {
        return bookingTimeInMillis;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }
}
