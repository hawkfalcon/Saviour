import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class SaviourWinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SaviourWinScreen extends World
{

<<<<<<< Updated upstream
public class SaviourWinScreen extends World {
    public SaviourWinScreen() {
        // Create a new world with 900x600 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        showText("YOU WIN!", getWidth() / 2, getHeight() / 2);
        showText("Total Time:   " + GlobalStatistics.getInstance().getTimer(), getWidth() / 4, getHeight() / 4);
    }

    //restart game on click
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            SaviourWorld sw = SaviourWorld.getInstance();
            sw.levelup();
            addObject(new Fade(sw.getNextLevel(false), true), getWidth() / 2, getHeight() / 2);
            sw.reset();
        }
=======
    /**
     * Constructor for objects of class SaviourWinScreen.
     * 
     */
    public SaviourWinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
       
        showText("CONGRATULATIONS!", getWidth() /3 - 100, getHeight()/4 - 50);
        showText("YOU WON!", getWidth() /3 - 150, getHeight()/4);
        
>>>>>>> Stashed changes
    }
}