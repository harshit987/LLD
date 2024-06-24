import java.util.List;
import java.util.Optional;

public class RandomStrategy implements SlotAllocationStrategy {

    @Override
    public ParkingSlot getAvailableSlot(ParkingLot parkingLot, Gate gate) {
        List<ParkingSlot> vacantSlots = parkingLot.getAllSlots();
        Optional<ParkingSlot> parkingSlot =
            vacantSlots.stream().filter(slot -> slot.isFunctional() && slot.isVacant()).findAny();
        return parkingSlot.orElse(null);
    }
}
