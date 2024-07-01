import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
public class InventoryManager {
    Map<String, Vehicle> vehicles = new HashMap<>();
    public InventoryManager(Map<String, Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    // All CRUD operations on inventory like adding/removing vehicle, getting vehicle, etc

    public List<Vehicle> getVehicles(int noOfSeats, VehicleType vehicleType) {
        // returns all the vehicles that has given number of seats
        return vehicles.values().stream().filter(vehicle -> vehicle.getNoOfSeats() == noOfSeats
            && vehicle.getVehicleType().equals(vehicleType)).toList();
    }

    public void addVehicle(Vehicle vehicle) {
        // add vehicle to inventory
    }

    public void removeVehicle(String vehicleNo) {
        // remove vehicle from inventory
    }

    public Vehicle getVehicle(String vehicleNo) {
        return vehicles.get(vehicleNo);
    }

    public void makeVehicleInActive(String vehicleNo) {
        // set the vehicle status to INACTIVE
    }
}
