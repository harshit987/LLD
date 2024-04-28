public interface ProcessingStrategy {
    public void insertRequest(int floorNumber, Direction direction);
    public int fetchNextFloor();

    public void removeNextFloor();

//    public int getSeekTime()
}
