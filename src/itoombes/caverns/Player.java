package itoombes.caverns;

public class Player {
    private String name;
    private int health;
    private int mana;

    //private ArrayList<Weapon> weapons;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
