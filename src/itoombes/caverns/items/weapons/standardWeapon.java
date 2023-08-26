package itoombes.caverns.items.weapons;


/**
 * Creates a simple weapon
 * Has a single, unchanging toHit and setDamage
 */
public class standardWeapon implements Weapon {
    private int damage;
    private int toHit;
    private String name;

    public standardWeapon(String name, int damage, int toHit) {
        this.name = name;
        this.damage = damage;
        this.toHit = toHit;
    }

    @Override
    public int damage() {
        return damage;
    }

    @Override
    public int toHit() {
        return toHit;
    }

    @Override
    public String getName() {
       return name;
    }
}
