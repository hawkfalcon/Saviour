import greenfoot.*;

/**
 * SaviourIntroScreen
 *
 * @author Tristen Miller
 */

public class SaviourIntroScreen extends World {

    /**
     * Constructor for objects of class SaviourIntroScreen.
     */
    public SaviourIntroScreen() {
        // Create a new world with 900x600 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        showText("SAVIOUR", getWidth() / 2, getHeight() / 2 - 30);
        showText("CLICK TO PLAY!", getWidth() / 2, getHeight() / 2);
    }

    //restart game on click
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            SaviourWorld sw = new SaviourWorld();
            Greenfoot.setWorld(sw.getNextLevel());
        }
    }
}
