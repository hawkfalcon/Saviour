import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flash extends Actor {
    boolean fadeIn = true;
    int transparency = 0;
    World nWorld;
    public Flash(World nWorld, boolean fadeIn) {
        this.fadeIn = fadeIn;
        this.nWorld = nWorld;
        if (!fadeIn) transparency = 255;
    }

    public void addedToWorld(World world) {  
        setImage(new GreenfootImage(world.getWidth(), world.getHeight()));
        getImage().setTransparency(transparency);
        getImage().fill();
    }  

    public void act() { 
      getImage().setTransparency(transparency);   
      if (fadeIn) {
        if (transparency < 255) {
            transparency++; 
        } else {
           Greenfoot.setWorld(nWorld);
        }
      } else {
        if (transparency > 0) {
            transparency--; 
        } else {
           getWorld().removeObject(this);
        }
      }

    }      
}
