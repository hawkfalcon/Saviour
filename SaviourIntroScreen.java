import greenfoot.*;

/**
 * SaviourIntroScreen
 */

public class SaviourIntroScreen extends World {
    public SaviourIntroScreen() {
        // Create a new world with 900x600 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        showText("Start Game", getWidth() - 230, getHeight()/4 - 50);
        prepare();
    }

    //restart game on click
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            SaviourWorld sw = new SaviourWorld();
            Greenfoot.setWorld(sw.getNextLevel());
        }
        
    }
    public void prepare(){
        addObject(new Character(), 150, 100);
        addObject(new Endpoint(), 570, 100);
    }
}
