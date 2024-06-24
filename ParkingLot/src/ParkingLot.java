import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class ParkingLot {
    Map<Integer, ParkingSlot> slots;
    public void addSlot(ParkingSlot parkingSlot) {
        slots.put(parkingSlot.getSlotNo(), parkingSlot);
    }

    public void removeSlot(int slotNo) {
        slots.remove(slotNo);
    }

    public void temporarySuspendSlot(int slotNo) {
        ParkingSlot parkingSlot = slots.get(slotNo);
        parkingSlot.setFunctional(false);
        slots.put(slotNo, parkingSlot);
    }

    public ParkingSlot getParkingSlot(int slotNo) {
        return slots.get(slotNo);
    }

    public List<ParkingSlot> getAllSlots() {
        return new ArrayList<>(slots.values());
    }
}
