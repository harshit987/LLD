import java.util.ArrayList;

public class ExitService {
    ParkingLotService parkingLotService;
    public ExitService(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public void processExit(Ticket ticket) {
        // wait for payment confirmation
        parkingLotService.releaseSlot(ticket.getSlotNo());
    }
}
