package game_random;

public class Account {
    private int winCount;
    private int tryCount;


    private Account(int winCount, int tryCount) {
        this.tryCount = tryCount;
        this.winCount = winCount;
    }

    static Account newAcc() {
        return new Account(0,0);
    }

    void addWin() {
        winCount++;
    }
    void addTry() {
        tryCount++;
    }


    public int getWinCount() {
        return winCount;
    }

    public int getTryCount() {
        return tryCount;
    }
}
