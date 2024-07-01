public class Vehicle {
    String vehicleNo;
    String modelNo;
    VehicleStatus vehicleStatus;
    float hourlyCost;
    float dailyCost;
    VehicleType vehicleType;
    int noOfSeats;

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public float getHourlyCost() {
        return hourlyCost;
    }

    public float getDailyCost() {
        return dailyCost;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public Vehicle(String vehicleNo, String modelNo, VehicleType vehicleType, int noOfSeats) {
        hourlyCost = 100;
        dailyCost = 3000;
        vehicleStatus = VehicleStatus.ACTIVE;
        this.vehicleNo = vehicleNo;
        this.modelNo = modelNo;
        this.vehicleType = vehicleType;
        this.noOfSeats = noOfSeats;
    }
}
