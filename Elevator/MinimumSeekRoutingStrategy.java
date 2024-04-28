import java.util.List;
import java.lang.Math;

public class MinimumSeekRoutingStrategy implements RoutingStrategy {
    @Override
    public ElevatorController chooseElevatorForRequest(List<ElevatorController> elevatorControllers, int floorNo, Direction direction) {

        int minSeekTime = Integer.MAX_VALUE;
        ElevatorController minSeekElevatorController = null;
        for(int i = 0; i<elevatorControllers.size() ;i++) {
            ElevatorController elevatorController = elevatorControllers.get(i);
            int seekTime = elevatorController.getSeekTime(floorNo, direction);
            if(seekTime < minSeekTime) {
                minSeekTime = seekTime;
                minSeekElevatorController = elevatorController;
            }
        }
        return minSeekElevatorController;
    }
}
