import greenfoot.*;

/**
 * @Author Dane
 */

public class King extends Actor {
    public int timer = 0;

    public void act() {
        detect();
        charge();
        kill();
        move(1);
    }

    public void detect() {
        if (getObjectsInRange(900, Character.class) != null) {
            for (Object o : getObjectsInRange(900, Character.class)) {
                Actor character = (Actor) o;
                turnTowards(character.getX(), character.getY());
            }
        }
    }

    public void charge() {
        timer++;
        if (timer >= 300) {
            move(3);
            if (timer == 325) {
                timer = 0;
            }
        }
    }

    public void kill() {
       //TODO WHAT DOES HE DO
    }

    public void setLocation(int x, int y) {
        //save the old location before we move
        int oldX = getX();
        int oldY = getY();
        super.setLocation(x, y);
        //don't actually move if there is a solid object blocking us.
        if (!getIntersectingObjects(Solid.class).isEmpty()) {
            super.setLocation(oldX, oldY);
        }
    }
}