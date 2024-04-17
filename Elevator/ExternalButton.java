public class ExternalButton {
    private ExternalButtonRouter externalButtonRouter;
    int floorNumber;

    public void pressButton(Direction direction) {
        externalButtonRouter.pressButton(floorNumber, direction);
    }
}
