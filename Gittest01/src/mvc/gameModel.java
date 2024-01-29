package mvc;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class gameModel {
    private int[] comNumber;
    private List<Integer> playerNumber;
    private int[] array;
    private int count;
    private int com;
    private int player;
    private int playerWin;
    private int comWin;
    private int draw;
    private int history;
    private int c;
    private int mapPattern;
    private int nextStage;
    private int ra;

    public gameModel() {
        comNumber = new int[9];
        playerNumber = new ArrayList<>();
        array = new int[9];
        count = 0;
        comWin = 0;
        draw = 0;
        playerWin = 0;
        history = 0;
        c = 0;
        mapPattern = 0;
        nextStage = 0;
        ra = 0;
    }

    public int[] getComNumber() {
        return comNumber;
    }

    public List<Integer> getPlayerNumber() {
        return playerNumber;
    }

    public int[] getArray() {
        return array;
    }

    public int getCount() {
        return count;
    }

    public int getCom() {
        return com;
    }

    public int getPlayer() {
        return player;
    }

    public int getPlayerWin() {
        return playerWin;
    }

    public int getComWin() {
        return comWin;
    }

    public int getDraw() {
        return draw;
    }

    public int getHistory() {
        return history;
    }

    public int getC() {
        return c;
    }

    public int getMapPattern() {
        return mapPattern;
    }

    public int getNextStage() {
        return nextStage;
    }

    public int getRa() {
        return ra;
    }

    public void initializeGame() {
        // Initialize game state
        // ...
    }

    public void playRound() {
        // Logic for playing a round
        // ...
    }
}