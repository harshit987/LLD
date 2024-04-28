import java.util.List;
public interface RoutingStrategy {
    public ElevatorController chooseElevatorForRequest(List<ElevatorController> elevatorControllers, int floorNo, Direction direction);
}
