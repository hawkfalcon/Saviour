import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class SaviourWinScreen extends World {

    public SaviourWinScreen() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
       
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