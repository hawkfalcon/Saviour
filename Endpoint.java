import greenfoot.*;

/**
 * The goal to get to at the end of the level
 */
public class Endpoint extends Actor {

    public boolean holdingkey = false;

    public void act() {
        characterHitsEndpoint();
        carryKey();
    }

    public void characterHitsEndpoint() {
        if (hasKey()) {
            Actor c = getOneIntersectingObject(Character.class);
            if (c != null) {
                animate(c);
                World world = getWorld();
                world.removeObject(c);
                if (world.getObjects(Timer.class).size() == 0) {
                    SaviourWorld sw = SaviourWorld.getInstance();
                    Greenfoot.setWorld(sw.getNextLevel(true));
                    return;
                }
                SaviourLevel sl = (SaviourLevel) world;
                if (sl.getSound() != null) {
                    sl.getSound().stop();
                }
                GlobalStatistics.getInstance().addTime(((Timer) world.getObjects(Timer.class).get(0)).getTime());
                SaviourWorld sw = SaviourWorld.getInstance();
                sw.levelup();
                world.addObject(new Fade(sw.getNextLevel(true), true), world.getWidth() / 2, world.getHeight() / 2);
            }
        }
    }

    public void carryKey() {
        if (getWorld().getObjects(Key.class).isEmpty()) {
            holdingkey = true;
        }
    }

    public boolean hasKey() {
        return holdingkey;
    }

    public void animate(Actor c) {
        getWorld().setPaintOrder(Character.class, Endpoint.class);
        for (int i = 1; i < 6; i++) {
            setImage("door" + i + ".png");
            Greenfoot.delay(3);
        }
        for (int i = 1; i < 40; i++) {
            c.setLocation(c.getX() + (getX() - c.getX()) / 10, c.getY() + (getY() - c.getY()) / 10);
            Greenfoot.delay(1);
        }
    }
}