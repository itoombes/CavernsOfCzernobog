package itoombes.caverns;

import itoombes.caverns.items.spells.*;
import itoombes.caverns.items.weapons.*;

public class Player {
    private String name;
    private int maxHealth;
    private int health;
    private int maxMana;
    private int mana;

    private Weapon[] weapons = {null,null,null};
    private Spell[] spells = {null, null, null};

    //private ArrayList<Weapon> weapons;

    public Player(String name, int maxHealth, int maxMana) {
        this.name = name;
        this.maxHealth = maxHealth;
        health = maxHealth;
        this.maxMana = maxMana;
        mana = maxMana;
        weapons[0] = new standardWeapon('Wooden sword', 1, 2);
    }

    public void applyDamage(int amount) {
       if (health < amount) {
           health = 0;
       } else {
           health -= amount;
       }
    }

    public boolean isAlive() {
        if (health = 0) {
            return false;
        } else {
            return true;
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getHealth() {
        return health;
    }
    public int getMaxMana() {
        return maxMana;
    }
    public int getMana() {
        return mana;
    }
}
