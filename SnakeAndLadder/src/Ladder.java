public class Ladder extends Step {

    public Ladder(Cell start, Cell end, Board board) {
        super(start, end);
        // ---- load snake specific metadata used for rendering snake image in the board.
        // ---------------
        render(board);
    }

    @Override
    protected void render(Board game) {
        System.out.println("Rendering ladder with head at (" + start.getRow() + ", " + start.getCol() + ") and tail at (" +
            end.getRow() + ", " + end.getCol() + ")");
    }

    @Override
    public String getType() {
        return "Ladder";
    }
}
