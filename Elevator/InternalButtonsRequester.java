public class InternalButtonsRequester {
    // Todo: It should have method to press button
    private ElevatorController elevatorController;

    public void pressButton(int floorNumber) {
        Elevator el = elevatorController.getElevator();
        Direction dir = (floorNumber > el.getCurrentFloor()) ? Direction.UP : Direction.DOWN;
        elevatorController.submitRequest(floorNumber, dir);
    }
}
