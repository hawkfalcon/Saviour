import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Endpoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endpoint extends Actor
{
    /**
     * Act - do whatever the Endpoint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
      characterHitsEndpoint();
    }  
    
    public void characterHitsEndpoint() {
        Actor c;
        c = getOneIntersectingObject(Character.class);
        if (c != null) {
          getWorld().removeObject(c);
          getWorld().addObject(new Flash(new SaviourWinScreen(), true), getWorld().getWidth()/2, getWorld().getHeight()/2);   
        }
    } 
}
