/**
 * Created by gilpratte on 9/7/16.
 */
public final class Player extends Character {
    // Not doing anything with these fields yet
    private String weapon;
    private String location;

    public Player(String newName) {
        this.name = newName;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getLocation() {
        return location;
    }

}
