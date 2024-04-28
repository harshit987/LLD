import java.lang.Thread;

public class ElevatorController {
    // It will have elevator and its method to accept request and getter and setter for elevator
    public Elevator elevator;
    private ProcessingStrategy processingStrategy;
    public Elevator getElevator() {
        return elevator;
    }

    public void submitRequest(int floor, Direction direction) {
        processingStrategy.insertRequest(floor, direction);
    }

    public void moveToNextFloor() throws InterruptedException {
        int finalFloor = processingStrategy.fetchNextFloor();
        int startFloor = elevator.getCurrentFloor();
        for(int floor = startFloor; floor <= finalFloor; floor++) {
            Thread.sleep(5000);
            elevator.setCurrentFloor(floor);
            System.out.println("Elevator " + elevator.getId() + " is at floor number " + elevator.getCurrentFloor());
            if(processingStrategy.fetchNextFloor() == floor) {
                elevator.setDoorState(Elevator.DoorState.OPEN);
                Thread.sleep(3000);
                elevator.setDoorState(Elevator.DoorState.CLOSED);
                break;
            }
        }
    }

    public int getSeekTime(int floorNo, Direction direction) {
        // TODO: Use direction for getting minimum seek time
        return Math.abs(floorNo - this.elevator.getCurrentFloor());
    }
}
