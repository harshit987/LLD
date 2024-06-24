import java.util.List;
import java.util.ArrayList;
public class EntryService {

    ParkingLotService parkingLotService;
    List<Ticket> bookings;

    public EntryService(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
        bookings = new ArrayList<>();
    }

    public Ticket bookEntryForVehicle(String vehicleNo, Gate gate) {
        ParkingSlot allocatedSlot = parkingLotService.allocateSlotForVehicle(vehicleNo, gate);
        Ticket ticket = new Ticket(allocatedSlot.getSlotNo(), System.currentTimeMillis(), vehicleNo);
        bookings.add(ticket);
        return ticket;
    }

    public List<Ticket> getBookings() {
        return bookings;
    }
}
