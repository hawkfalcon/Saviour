import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SaviourIntroScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SaviourIntroScreen extends World
{

    /**
     * Constructor for objects of class SaviourIntroScreen.
     * 
     */
    public SaviourIntroScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        showText("CLICK TO PLAY!", getWidth()/2, getHeight()/2);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            SaviourWorld sw = new SaviourWorld();
            Greenfoot.setWorld(sw);
        }
    }
}
