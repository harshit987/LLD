import java.util.List;
import java.time.LocalDate;
import java.util.Map;

public class Store {
    Long storeId;
    InventoryManager inventoryManager;
    Location location;

    Map<Long, Reservation> reservations;

    // All inventory CRUD operation will be delegated to inventoryManager object of the Store
    public List<Vehicle> getVehicles(int noOfSeats, VehicleType vehicleType) {
        return inventoryManager.getVehicles(noOfSeats, vehicleType);
    }

    public Reservation makeReservation(Vehicle vehicle, User user, LocalDate startDate, LocalDate endDate) {
        Reservation reservation = new Reservation(vehicle, user, LocalDate.now(), startDate, endDate);
        reservations.put(reservation.getReservationId(), reservation);
        return reservation;
    }

    public boolean isVehicleAvailable(Vehicle vehicle, LocalDate startDate, LocalDate endDate) {
        for(Reservation reservation: reservations.values()) {
            Vehicle v = reservation.getVehicle();
            if(vehicle.equals(v) && v.getVehicleStatus().equals(VehicleStatus.ACTIVE)) {
                if(startDate.isBefore(reservation.getBookingTill()) && endDate.isAfter(reservation.getBookingFrom())) {
                    return false;
                }
            }
        }
        return true;
    }
}
