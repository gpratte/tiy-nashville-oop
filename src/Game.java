/**
 * Created by gilpratte on 9/7/16.
 */
public class Game {

    public static void main(String[] args) throws Exception {
        Player player = new Player("G.I.Joe");
        Enemy ogre = new Enemy("Ogre");
        player.battle(ogre);
    }

}
