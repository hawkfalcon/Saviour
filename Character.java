import greenfoot.*;

/**
 * Your character. Basic ARROW KEY movement.
 *
 * @author Tristen
 */

public class Character extends Actor {
    int moveAmount = 4; //speed we move

    public void act() {
        moveWithKeys();
        pickUpKey();
        checkHaungsMode();
    }

    //I hope this is self explanatory.
    public void moveWithKeys() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - moveAmount, getY());
            setImage("characterleft.png");
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + moveAmount, getY());
            setImage("characterright.png");
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - moveAmount);
            //setImage("characterup.png");
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + moveAmount);
            //setImage("characterdown.png");
        }

    }

    //We override the setLocation to take into account solid actors.
    //this was borrowed partially from the greenfoot website.
    public void setLocation(int x, int y) {
        //save the old location before we move
        int oldX = getX();
        int oldY = getY();
        super.setLocation(x, y);
        //don't actually move if there is a solid object blocking us.
        if (!getIntersectingObjects(Solid.class).isEmpty()) {
            super.setLocation(oldX, oldY);
        }
        if (!getIntersectingObjects(Endpoint.class).isEmpty()) {
            if (!((Endpoint) (getIntersectingObjects(Endpoint.class).get(0))).hasKey()) {
                super.setLocation(oldX, oldY);
            }
        }
    }

    //Picking up keys
    public void pickUpKey() {
        Actor key = getOneIntersectingObject(Key.class);
        if (key != null) {
            getWorld().removeObject(key);
        }
    }

    //sets haungs mode. @author Dane
    public void checkHaungsMode() {
        if (Greenfoot.isKeyDown("h")) {
            SaviourWorld.getInstance().setHaungsMode(true);
        }
        if (Greenfoot.isKeyDown("y")) {
            SaviourWorld.getInstance().setHaungsMode(false);
        }
        if (Greenfoot.isKeyDown("b")) {
            SaviourWorld.getInstance().cheat();
        }
    }
}