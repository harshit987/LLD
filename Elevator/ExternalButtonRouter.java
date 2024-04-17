import java.util.List;
public class ExternalButtonRouter {
    List<ElevatorController> elevatorControllers;
    RoutingStrategy strategy;
    public void pressButton(int floorNo, Direction direction) {
        ElevatorController elevatorController =
            strategy.chooseElevatorForRequest(elevatorControllers, floorNo, direction);
        elevatorController.submitRequest(floorNo, direction);
    }
}
