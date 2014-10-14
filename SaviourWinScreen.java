import greenfoot.*;

/**
 * SaviourWinScreen
 *
 * @author Tristen Miller
 */

public class SaviourWinScreen extends World {

    /**
     * Constructor for objects of class SaviourWinScreen.
     */
    public SaviourWinScreen() {
        // Create a new world with 900x600 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        showText("YOU WIN!", getWidth() / 2, getHeight() / 2);
    }

    //restart game on click
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            SaviourWorld sw = new SaviourWorld();
            Greenfoot.setWorld(sw.getNextLevel());
        }
    }
}
