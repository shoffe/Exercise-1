package OOP;

public class GameCharacter {
    String name;
    int hp;
    int power;

    public GameCharacter(String name, int hp, int power) {
        this.name = name;
        this.hp = hp;
        this.power = power;
    }

    public void getDamage(int power) {
        hp -= power;
        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " - Лох, проиграл...");
        } else {
            System.out.println(name + " получил " + power + " урона");
            System.out.println("Остаток здоровья: " + hp);
            System.out.println();
        }
    }

public void giveDamage(GameCharacter opponent) {
    System.out.println(name + " атаковал " + opponent.name + " с силой " + power);
    opponent.getDamage(power);
    }


    public static void main(String[] args) {
        GameCharacter player1 = new GameCharacter("Vasya", 100, 20);
        GameCharacter player2 = new GameCharacter("Petya", 100, 15);

        while (player1.hp > 0 && player2.hp > 0) {
            player1.giveDamage(player2);
            if (player2.hp <= 0) break;
            player2.giveDamage(player1);
        }

        System.out.println("Битва окончена!");


    }
}
