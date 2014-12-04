import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class SaviourWinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class SaviourWinScreen extends World {
<<<<<<< HEAD
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
        int totalseconds = 3400;//GlobalStatistics.getInstance().getTimer();
        int seconds = (int) totalseconds % 60;
        int minutes = (int) ((totalseconds / 60) % 60);
        int hours = (int) ((totalseconds / (60*60)) % 24);
        if (hours != 0) {
            showText("YOU TOOK OVER AN HOUR. YOU ARE CRAZY!", getWidth() / 3, getHeight() / 3);
        } else {
            showText("You beat the game in " + minutes + " minutes and " + seconds + " seconds!", getWidth() / 3, getHeight() / 3);
        }
    } 
=======
    public SaviourWinScreen() {
        // Create a new world with 900x600 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        showText("YOU WIN!", getWidth() / 2, getHeight() / 2);
        showText("Total Time:   " + GlobalStatistics.getInstance().getTimer(), getWidth() / 4, getHeight() / 4);
    }

>>>>>>> FETCH_HEAD
    //restart game on click
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            SaviourWorld sw = SaviourWorld.getInstance();
            sw.levelup();
            addObject(new Fade(sw.getNextLevel(false), true), getWidth() / 2, getHeight() / 2);
            sw.reset();
        }
    }
}