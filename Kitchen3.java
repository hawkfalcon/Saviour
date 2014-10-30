import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kitchen3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kitchen3 extends SaviourLevel
{

    /**
     * Constructor for objects of class Kitchen3.
     * 
     */
    public Kitchen3()
    {
        super(90, 70, 825, 200);
        prepareWalls();
    }
    
    public void prepareWalls()
    {
        //generates all the walls. 
        //you could just place them and save the world.
        
        //Top Left Horizontal Wall
         for (int i = 1; i < 10; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 1 - halfWall);
        }
        //Top Right Horizontal Wall
        for (int i = 14; i <30 ; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 1 - halfWall);
        }
        //Bottom Left Vertical Wall
        for (int i = 10; i < 16; i++) {
            addObject(new Wall(), (getWidth() / 30) * 5 + halfWall, getPos(i));
        }
        // Middle Vertical Wall
        for (int i = 5; i < 15; i++) {
            addObject(new Wall(), (getWidth() / 30 ) * 14 + halfWall, getPos(i));
        }
        // Middle Left Horizontal Wall
        for (int i = 6; i < 10; i++) {
            addObject(new Wall(), getPos(i), getHeight() / 2 + halfWall);
        }
        //Long Bottom Wall Part 1
        for (int i = 6; i < 15; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 3 + halfWall);
        }
        //Long Bottom Wall Part 2
        for (int i = 20; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 3 + halfWall);
        }
        //Middle Right Vertical Wall
        for (int i = 11; i < 15; i++) {
            addObject(new Wall(), (getWidth() / 30 ) * 20 + halfWall, getPos(i));
        }
        //Middle Far Right Vertical wall
        for (int i = 5; i < 11; i++) {
            addObject(new Wall(), (getWidth() / 30 ) * 25 + halfWall, getPos(i));
        }
    }
}
