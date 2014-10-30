import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Brick
 */
public class Brick extends Obstacle
{
    //@author Leighton
    //Takes a speed int (new Brick(2);)
    public Brick(int speed) {
        //int incrementX, int incrementY, int speed, int distance
        initSlider(0, 1, speed, 100);
    }
    public void act() 
    {
        slider();
        killer();
    }    
}
