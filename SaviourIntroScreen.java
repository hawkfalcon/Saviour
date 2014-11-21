import greenfoot.*;

/**
 * SaviourIntroScreen
 */

public class SaviourIntroScreen extends World {
    public SaviourIntroScreen() {
        // Create a new world with 900x600 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        showText("Click to play...", getWidth() / 2 - 40, getHeight() - 40);
    }

    //restart game on click
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            SaviourWorld sw = SaviourWorld.getInstance();
            Greenfoot.setWorld(sw.getNextLevel(true));
        }
    }
}
