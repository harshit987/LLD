public class ParkingLotService {
    private volatile ParkingLotService parkingLotService;

    private ParkingLot parkingLot;
    private SlotAllocationStrategy allocationStrategy;


    private ParkingLotService(ParkingLot parkingLot, SlotAllocationStrategy allocationStrategy) {
        this.parkingLot = parkingLot;
        this.allocationStrategy = allocationStrategy;
    }

    public void setAllocationStrategy(SlotAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    public synchronized ParkingSlot allocateSlotForVehicle(String vehicleNo, Gate gate) {
        ParkingSlot parkingSlot = allocationStrategy.getAvailableSlot(parkingLot, gate);
        parkingSlot.setVacant(false);
        parkingSlot.setCurrVehicleNo(vehicleNo);
        return parkingSlot;
    }

    public synchronized void releaseSlot(int slotNo) {
        ParkingSlot slot = parkingLot.getParkingSlot(slotNo);
        slot.setVacant(true);
        slot.setCurrVehicleNo(null);
    }

    public ParkingLotService getParkingLotService(ParkingLot parkingLot, SlotAllocationStrategy allocationStrategy) {
        if(parkingLotService == null) {
            synchronized(this) {
                if(parkingLotService == null) {
                    parkingLotService = new ParkingLotService(parkingLot, allocationStrategy);
                }
            }
        }
        return parkingLotService;
    }


}
