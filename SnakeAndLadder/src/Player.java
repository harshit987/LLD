public class Player {
    private Cell position;
    private String name;
    private Integer rank;
    public Player(Cell start, String name) {
        rank = null;
        this.position = start;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Integer getRank() {
        return rank;
    }

    public Cell getPosition() {
        return position;
    }

    public void move(Cell nextPosition) {
        this.position = nextPosition;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
