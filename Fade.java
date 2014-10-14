import greenfoot.*;

/**
 * Write a description of class Fade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fade extends Actor {
    boolean fadeIn = true;
    int transparency = 0;
    World nWorld;

    public Fade(World nWorld, boolean fadeIn) {
        this.fadeIn = fadeIn;
        this.nWorld = nWorld;
        if (!fadeIn) transparency = 255;
    }

    public void addedToWorld(World world) {
        setImage(new GreenfootImage(world.getWidth(), world.getHeight()));
        getImage().setTransparency(transparency);
        getImage().fill();
    }

    public void act() {
        getImage().setTransparency(transparency);
        if (fadeIn) {
            if (transparency < 255) {
                transparency += 3;
            } else {
                Greenfoot.setWorld(nWorld);
            }
        } else {
            if (transparency > 1) {
                transparency -= 2;
            } else {
                getWorld().removeObject(this);
            }
        }

    }
}
