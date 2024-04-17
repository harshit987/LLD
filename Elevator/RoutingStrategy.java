import java.util.List;
public interface RoutingStrategy {
    ElevatorController chooseElevatorForRequest(List<ElevatorController> elevatorControllers, int floorNo, Direction direction);
}
