import greenfoot.*;

/**
 * Acid
 * kingKiller created by Leighton
 */
public class Acid extends Obstacle {
    public void act() {
        killer();
        kingKiller();
    }

    public void kingKiller() {
        //this kills the king
        Actor g = getOneIntersectingObject(King.class);
        if (g != null) {
            //remove king from the world
            getWorld().removeObject(g);
            //change the location of the key hidden in wall
            Actor key = (Actor) getWorld().getObjects(Key.class).get(0);
            key.setLocation(560, 72);
        }
    }
}
