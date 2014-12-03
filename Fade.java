import greenfoot.*;

/**
 * Fade effect between worlds and death.
 *
 * @author Tristen
 */
public class Fade extends Actor {

    boolean fadeIn = true;
    int transparency = 0;
    World nWorld;

    //fade into a world, fade in or out
    public Fade(World nWorld, boolean fadeIn) {
        this.fadeIn = fadeIn;
        this.nWorld = nWorld;
        if (!fadeIn) transparency = 255;
    }

    //create black object when Fade is created. If its fading in, its transparent.
    public void addedToWorld(World world) {
        setImage(new GreenfootImage(world.getWidth(), world.getHeight()));
        getImage().setTransparency(transparency);
        getImage().fill();
    }

    public void act() {
        //set the transparency of the black object
        getImage().setTransparency(transparency);
        //if its fading in (called when we want to change worlds)
        if (fadeIn) {
            //if its not completely black yet
            if (transparency < 255) {
                //fade in
                transparency += 3;
            } else {
                //its completely black! Set the new world.
                Greenfoot.setWorld(nWorld);
            }
            //called on world creation
        } else {
            //its fading out, if its not clear yet
            if (transparency > 3) {
                //fade out
                transparency -= 5;
            } else {
                //remove the object
                getWorld().removeObject(this);
            }
        }
    }
}