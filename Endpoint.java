import greenfoot.*;

/**
 * The goal to get to at the end of the level
 */
public class Endpoint extends Actor {
    public boolean holdingkey = false;

    /**
     * Act - do whatever the Endpoint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        characterHitsEndpoint();
        carryKey();
    }

    public void characterHitsEndpoint() {
        if (holdingkey) {
            Actor c = getOneIntersectingObject(Character.class);
            if (c != null) {
<<<<<<< HEAD
                SaviourLevel world = (SaviourLevel)getWorld();
                world.removeObject(c);
                world.getSound().stop();
=======
                World world = getWorld();
                world.removeObject(c);
                if (world.getObjects(Timer.class).size() == 0) {
                    SaviourWorld sw = SaviourWorld.getInstance();
                    Greenfoot.setWorld(sw.getNextLevel(true));
                    return;
                }
                GlobalStatistics.getInstance().addTime(((Timer)world.getObjects(Timer.class).get(0)).getTime());
                Stars.getInstance().snatchTime(((Timer)world.getObjects(Timer.class).get(0)).getTime());
>>>>>>> FETCH_HEAD
                SaviourWorld sw = SaviourWorld.getInstance();
                sw.levelup();
                world.addObject(new Fade(sw.getNextLevel(true), true), world.getWidth() / 2, world.getHeight() / 2);
                GlobalStatistics.getInstance().addStars(Stars.getInstance().earnedStars());
                //System.out.println(Stars.getInstance().earnedStars());
                Stars.getInstance().timerReset();
            }
        }
    }

    public void carryKey() {
        if (getWorld().getObjects(Key1.class).isEmpty()) {
            holdingkey = true;
        }
    }

    public boolean haveKey() {
        return holdingkey;
    }
}
