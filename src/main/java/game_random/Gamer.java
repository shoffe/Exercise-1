package game_random;

public class Gamer {
    private final String nickname;
    private final Account account;

    public Gamer(String nickname) {
        this.nickname = nickname;
        account = Account.newAcc();
    }

    public void addTry() {
        account.addTry();
    }

    public void addWin() {
        account.addWin();
    }
    void printAccInfo() {
        System.out.println("Имя игрока: " + nickname);
        System.out.println("Кол-во попыток: " + account.getTryCount());
        System.out.println("Кол-во побед: " + account.getWinCount());
        System.out.println();
    }
}
