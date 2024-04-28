import java.util.List;

public class HashModNRoutingStrategy implements RoutingStrategy {
    @Override
    public ElevatorController chooseElevatorForRequest(List<ElevatorController> elevatorControllers, int floorNo, Direction direction) {
        int numberOfElevator = elevatorControllers.size();
        return elevatorControllers.get(floorNo % numberOfElevator);
    }
}
