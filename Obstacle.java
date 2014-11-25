import greenfoot.*;

/**
 * Easily create Obstacles
 */
public class Obstacle extends Actor {

    /**
     * Things you can use in an obstacle:
     * killer(); (kills on touch)
     * respawner(); (respawns when it hits a wall)
     * slider(); (slides back and forth)
     * initSlider(); (optional to adjust slider)
     */

    int x, y;

    //run upon object creation
    public void addedToWorld(World world) {
        //get start locations
        x = getX();
        y = getY();
    }

    //kill player if touched
    public void killer() {
        //check if Haungs Mode has been activated
        if (!SaviourWorld.getInstance().haungsMode()) {
            //get character
            Actor c = getOneIntersectingObject(Character.class);
            if (c != null) {
                //add timer
                GlobalStatistics.getInstance().addTime(((Timer)getWorld().getObjects(Timer.class).get(0)).getTime());
                Stars.getInstance().snatchTime(((Timer)getWorld().getObjects(Timer.class).get(0)).getTime());
                //remove him
                getWorld().removeObject(c);
                //get the world manager
                SaviourWorld sw = SaviourWorld.getInstance();
                //restart level
                getWorld().addObject(new Fade(sw.getNextLevel(false), true), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            }

        }
    }

    //move and respawn when it hits a wall
    public void respawner() {
        //move
        move(2);
        //if it hits a wall
        if (!getIntersectingObjects(Wall.class).isEmpty()) {
            //set back to original location
            super.setLocation(x, y);
        }
    }
    
    public void fly(){
        //move
        move(2);
        if (getObjectsInRange(900, Character.class) != null) {
            for (Object o : getObjectsInRange(900, Character.class)) {
                Actor character = (Actor) o;
                turnTowards(character.getX(), character.getY());
            }
        }
    }

    //Slider info
    int incrementX = 0;
    int incrementY = 1;
    int initialSpeed = 2;
    int adjustingSpeed = 2;
    int initialDistance = 45;
    int adjustingDistance = 45;

    //give a slider some values
    public void initSlider(int incrementX, int incrementY, int speed, int distance) {
        this.incrementX = incrementX;
        this.incrementY = incrementY;
        this.initialSpeed = speed;
        this.adjustingSpeed = speed;
        this.initialDistance = distance;
        this.adjustingDistance = distance;
    }

    //slide back and forth (spikes, spear)
    public void slider() {
        //only run once per speed (slows it down)
        if (adjustingSpeed == 0) {
            //if its sliding out
            if (adjustingDistance > 0) {
                //move and change distance
                setLocation(getX() + incrementX, getY() + incrementY);
                adjustingSpeed = initialSpeed;
                adjustingDistance--;
                //flip to sliding in
            } else {
                adjustingDistance = initialDistance;
                incrementX = -incrementX;
                incrementY = -incrementY;
            }
        } else {
            adjustingSpeed--;
        }
    }
}
