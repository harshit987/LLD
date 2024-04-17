public class Elevator {
    // Todo: it will have current floor, direction - enum(up or down), isOpen - enum(open/closed), isMoving - enum(idle/moving)
    // methods to set and get these fields of a elevator
    public static enum Movement {
        IDLE,
        MOVING
    }

    public static enum DoorState {
        OPEN,
        CLOSED
    }

    private int id;
    private int currentFloor;
    private Direction direction;
    private DoorState doorState;
    private Movement movement;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public DoorState getDoorState() {
        return doorState;
    }

    public void setDoorState(DoorState doorState) {
        this.doorState = doorState;
    }

    public Movement getMovement() {
        return movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}