import greenfoot.*;

/**
 * Acid
 */
public class Acid extends Obstacle {
    public void act() {
        killer();
        kingKiller();
    }

    public void kingKiller(){
        //this kills the king
        Actor g = getOneIntersectingObject(King.class);
        if (g != null){
            getWorld().removeObject(g);
            getWorld().addObject(new Key1(), 562, 107);
        }
    }
    }
