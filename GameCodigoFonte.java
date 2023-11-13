public class Player {
    private String playerType;

    public Player(String playerType) {
        this.playerType = playerType;
    }

    public void attack() {
        if (playerType.equals("Knight")) {
            System.out.println("Swing sword");
        } else if (playerType.equals("Archer")) {
            System.out.println("Shoot arrow");
        } else if (playerType.equals("Wizard")) {
            System.out.println("Cast spell");
        }
    }
}

public class Game {
    public static void main(String[] args) {
        Player knight = new Player("Knight");
        Player archer = new Player("Archer");
        Player wizard = new Player("Wizard");

        knight.attack();
        archer.attack();
        wizard.attack();
    }
}
