public abstract class ParkingSlot {
    private boolean isVacant;
    private int slotNo;
    private Location location;
    protected float perHourPrice;
    private boolean isFunctional;
    private String currVehicleNo;

    public boolean isFunctional() {
        return isFunctional;
    }

    public void setFunctional(boolean functional) {
        isFunctional = functional;
    }

    public ParkingSlot(int slotNo, int floorNo, int x, int y) {
        this.slotNo = slotNo;
        location = new Location(x, y, floorNo);
        isVacant = true;
    }

    public boolean isVacant() {
        return isVacant;
    }

    public void setVacant(boolean vacant) {
        isVacant = vacant;
    }

    public void setPerHourPrice(float perHourPrice) {
        this.perHourPrice = perHourPrice;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public float getPerHourPrice() {
        return perHourPrice;
    }

    public void setCurrVehicleNo(String vehicleNo) {
        this.currVehicleNo = vehicleNo;
    }
}
