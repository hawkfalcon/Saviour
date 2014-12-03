import greenfoot.*;

/**
 * Write a description of class King here.
 *
 * Dane(original)
 * Leighton(expanded upon
 * - added knife throwing
 * - smoother movement when stuck on solids)
 * 
 */
public class King extends Obstacle {
    public int timer = 0; 
    
    public void act() {
        detect();
        charge();
        killer();
        move(1);
    }

    /**
     * Follows the character around the map
     */
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
            if (timer == 350) {
                throwKnife();
                timer = 0;
            }
        }
    }

    public void setLocation(int x, int y) {
        //save the old location before we move
        int oldX = getX();
        int oldY = getY();
        super.setLocation(x, y);
        int directionX = oldX > getX() ? 1 : -1;
        int directionY = oldY > getY() ? 1 : -1;
        //don't actually move if there is a solid object blocking us.
        if (!getIntersectingObjects(Solid.class).isEmpty()) {
           super.setLocation(oldX + directionX, oldY + directionY);
           move(1);
        }
    }
    
    public void throwKnife(){
        //throws a knife in character's direction
        Knife knife = new Knife();
        getWorld().addObject(knife, getX(), getY());        
    }
}