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
                World world = getWorld();
                world.removeObject(c);
                GlobalTimer.getInstance().addTime(((Timer)world.getObjects(Timer.class).get(0)).getTime());
                SaviourWorld sw = SaviourWorld.getInstance();
                sw.levelup();
                world.addObject(new Fade(new CutScene(sw.getLevel()), true), world.getWidth() / 2, world.getHeight() / 2);
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
