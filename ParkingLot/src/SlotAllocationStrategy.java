public interface SlotAllocationStrategy {
    ParkingSlot getAvailableSlot(ParkingLot parkingLot, Gate gate);
}
