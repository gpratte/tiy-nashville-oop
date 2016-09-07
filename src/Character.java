import java.util.Random;

/**
 * Superclass to player and enemy. The instance variables are set in the constructor
 */
public abstract class Character {
    protected String name;
    protected int health;
    protected int damage;
    protected Random random = new Random(System.currentTimeMillis());

    public Character() {
        health = random.nextInt(100);
        damage = random.nextInt(100);
        System.out.printf("health=%s and damange=%s \n",health,damage);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    /*
     This character battles another character.
     */
    public void battle(Character enemy) {
        System.out.printf("%s appears!\n", enemy.name);

        while (health > 0 && enemy.health > 0) {
            health -= enemy.damage;
            enemy.health -= damage;
            System.out.printf("%s's health: %d\n", name, health);
            System.out.printf("%s's health: %d\n", enemy.name, enemy.health);
        }

        String message = "%s has died.\n";

        if (health <= 0) {
            System.out.printf(message, name);
        }

        if (enemy.health <= 0) {
            System.out.printf(message, enemy.name);
        }
    }
}
