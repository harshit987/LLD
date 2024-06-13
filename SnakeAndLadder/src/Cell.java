public class Cell {
    // 1-indexed position
    private int row;
    private int col;
    Step snakeOrLadder;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }

    public Step getStep() {
        return snakeOrLadder;
    }

    public boolean hasSnakeOrLadder() {
        return snakeOrLadder != null;
    }

    public void setStep(Step step) {
        this.snakeOrLadder = step;
    }
}
