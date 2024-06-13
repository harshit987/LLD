import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;
import java.lang.Thread;

public class Game {
    Board board;
    Queue<Player> players;
    int rank;


    public Game() {
        this.board = new Board(10, 10);
        this.players = new LinkedList<>();
        addPlayer("Harshit");
        addPlayer("Mudit");
        addPlayer("Vipul");
        rank = 1;
    }

    protected void addPlayer(String name) {
        System.out.println("Adding player " + name);
        players.add(new Player(board.getCell(1, 1), name));
    }

    private int rollDice() throws InterruptedException {
        Thread.sleep(1000);
        return new Random().nextInt(6) + 1;
    }

    public boolean play(Player player) throws InterruptedException {
        System.out.println("---------------------------------");
        System.out.println("current player: " + player.getName());
        System.out.println("current position of the player is (" + player.getPosition().getRow() + ", " + player.getPosition().getCol() + ")");
        System.out.println("Rolling the dice");
        int step = rollDice();
        System.out.println("Dice number came out to be " + step);
        Cell currPosition = player.getPosition();

        int currIdx = (currPosition.getRow() - 1) * board.getnCols() + currPosition.getCol();
        if(currIdx + step > board.getnCols() * board.getnRows())
            return true;
        currPosition = board.getCell(currIdx + step);
        while(currPosition.hasSnakeOrLadder()) {
            System.out.println("Stepped at a " + currPosition.getStep().getType());
            currPosition = currPosition.getStep().getEnd();
        }
        player.move(currPosition);
        System.out.println("current position of the player is (" + player.getPosition().getRow() + ", " + player.getPosition().getCol() + ")");
        return false;
    }

    public void start() throws InterruptedException {
        while(players.size() > 1) {
            Player player = players.peek();
            players.poll();
            boolean isReached = play(player);
            if(!isReached) {
                players.add(player);
            } else {
                System.out.println(player.getName() + " has " + rank + " rank!!");
                player.setRank(rank++);
            }
        }
        players.peek().setRank(rank);
        System.out.println(players.peek().getName() + " got last.");
    }
}
