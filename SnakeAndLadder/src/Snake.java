public class Snake extends Step {
    public Snake(Cell start, Cell end, Board board) {
        super(start, end);
        // ---- load snake specific metadata used for rendering snake image in the board.
        // ---------------
        render(board);
    }

    @Override
    protected void render(Board game) {
        System.out.println("Rendering snake with head at (" + start.getRow() + ", " + start.getCol() + ") and tail at (" +
            end.getRow() + ", " + end.getCol() + ")");
    }

    @Override
    public String getType() {
        return "Snake";
    }


}
