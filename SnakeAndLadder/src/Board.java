import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class Board {
    int nRows;

    public int getnRows() {
        return nRows;
    }

    public int getnCols() {
        return nCols;
    }

    int nCols;
    Map<Integer, Cell> cells;

    public Board(int nRows, int nCols) {
        this.nRows = nRows;
        this.nCols = nCols;
        cells = new HashMap<>();
        for(int i=1; i<=nRows; i++) {
            for(int j=1; j<=nCols; j++) {
                cells.put((i-1) * nCols + j, new Cell(i, j));
            }
        }
        Random rand = new Random();
        for(int k=0;k<15; k++) {
            int r1 = rand.nextInt(nRows) + 1;
            int c1 = rand.nextInt(nCols) + 1;
            int r2 = rand.nextInt(nRows) + 1;
            int c2 = rand.nextInt(nCols) + 1;
            Cell start = getCell(r1, c1);
            Cell end = getCell(r2, c2);
            int diff = (r1 - 1) * nCols + c1 - ((r2-1) * nCols + c2);
            if(diff == 0) {
                k--;
                continue;
            }
            if(diff > 0) {
                start.setStep(new Snake(start, end, this));
            } else {
                start.setStep(new Ladder(start, end, this));
            }
        }
    }
    public Cell getCell(int x, int y) {
        int idx = (x-1) * this.nCols + y;
        return cells.get(idx);
    }

    public Cell getCell(int x) {
        return cells.get(x);
    }
}
