import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bedroom2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bedroom2 extends SaviourLevel
{

    /**
     * Constructor for objects of class Bedroom2.
     * 
     */
    public Bedroom2()
    {
        super(90, 70, 675, 200);
        setWalls();
    }
    public void setWalls()
    {
         // top horiz wall
        for (int i = 1; i < 25; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 480 + halfWall);
        }
        //right vert wall
        for (int i = 4; i < 15; i++) {
            addObject(new Wall(), getWidth() - 180 + halfWall, getPos(i));
        }
        //Bottom horiz wall
        for (int i = 5; i < 25; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 180 + halfWall);
        }
        //left vert wall
        for (int i = 9; i < 15; i++) {
            addObject(new Wall(), getWidth() /6 + halfWall, getPos(i));
        }
        for (int i = 5; i < 10; i++) {
            addObject(new Wall(), getWidth() /3 + halfWall, getPos(i));
        }
         for (int i = 9; i < 15; i++) {
            addObject(new Wall(), getWidth() /2 + halfWall, getPos(i));
        }
         for (int i = 5; i < 10; i++) {
            addObject(new Wall(), getWidth() /2 + 130 + halfWall, getPos(i));
        }
    }
}
