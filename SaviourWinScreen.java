import greenfoot.*;

/**
 * SaviourWinScreen
 */

public class SaviourWinScreen extends World {
    public SaviourWinScreen() {
        // Create a new world with 900x600 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        showText("YOU WIN!", getWidth() / 2, getHeight() / 2);
    }

    //restart game on click
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            SaviourWorld sw = SaviourWorld.getInstance();
            sw.reset();
            addObject(new Fade(sw.getNextLevel(), true), getWidth() / 2, getHeight() / 2);            
        }
    }
}
