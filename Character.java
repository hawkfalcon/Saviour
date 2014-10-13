import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author Tristen Miller
 * @version (a version number or a date)
 */
public class Character extends Actor {
    int moveAmount = 4;
    public void act() {
       moveWithKeys();
    }    
    
    public void setLocation(int x, int y) {  
       int oldX = getX();  
       int oldY = getY();  
       super.setLocation(x, y);  
       if(!getIntersectingObjects(Solid.class).isEmpty()) {  
        super.setLocation(oldX, oldY);  
       } 
   }  
    public void moveWithKeys() {
       if (Greenfoot.isKeyDown("left")) {
           setLocation(getX() -moveAmount, getY());
       }
       if (Greenfoot.isKeyDown("right")) {
             setLocation(getX() +moveAmount, getY());
       }
       if (Greenfoot.isKeyDown("up")) {
           setLocation(getX(), getY() -moveAmount);
       }
       if (Greenfoot.isKeyDown("down")) {
           setLocation(getX(), getY() +moveAmount);
       }
    }
}
