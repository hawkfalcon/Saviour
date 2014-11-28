import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Leighton made this
 */
public class Knife extends Obstacle
{
    public void act() 
    {
        fly();
        killer();
        die();
    }

    public void die()
    {
        //Knife dissapears if it hits a wall
        if(!getIntersectingObjects(Solid.class).isEmpty()){
            //Remove the knife
            getWorld().removeObject(this);
        }
    }
}
