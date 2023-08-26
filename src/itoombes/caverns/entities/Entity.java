package itoombes.caverns.entities;

public interface Entity {
    String getName();

    int attack();
    int defend();
    boolean hasHeal();

    void getDefense();
    void applyDamage();
}
