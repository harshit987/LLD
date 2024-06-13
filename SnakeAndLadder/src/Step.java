public abstract class Step {
    Cell start;
    Cell end;

    public Step(Cell start, Cell end) {
        this.start = start;
        this.end = end;
    }
    protected abstract void render(Board game);

    public Cell getEnd() {
        return end;
    }

    public abstract String getType();
}
