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
public class King extends Actor {
    public int timer = 0; 
    
    public void act() {
        detect();
        charge();
        kill();
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

    public void kill() {
        if (!SaviourWorld.getInstance().haungsMode()) {
            Actor c = getOneIntersectingObject(Character.class);
            if (c != null) {
                getWorld().removeObject(c);
                SaviourWorld sw = SaviourWorld.getInstance();
                getWorld().addObject(new Fade(sw.getNextLevel(false), true), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
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