import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bedroom1 here.
 * 
 * @author Manasi Nagtode
 * @version (a version number or a date)
 */
public class Bedroom1 extends SaviourLevel
{

    /**
     * Constructor for objects of class Bedroom1.
     * 
     */
    public Bedroom1()
    {
       super(90, 70, 675, 200);
        prepare(); 
    
    }
    
    public void prepare()
    {
        prepareWalls();
       
    }
    public void prepareWalls()
    {
        //1st vert wall
        for (int i = 5; i < 15; i++) {
            addObject(new Wall(), getWidth() / 6 + halfWall, getPos(i));
        }
        //bottom horizontal wall
        for (int i = 6; i < 25; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 180 + halfWall);
        }
        //right vet wall
        for (int i = 4; i < 15; i++) {
            addObject(new Wall(), getWidth() - 360 + halfWall, getPos(i));
        }
        //second from bottom horizontal wall
        for (int i = 19; i < 30; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 330 + halfWall);
        }
        // second vert wall
        for (int i = 1; i < 11; i++) {
            addObject(new Wall(), getWidth() / 3 + 50 + halfWall, getPos(i));
        }
        // top horiz wall
        for (int i = 19; i < 25; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 480 + halfWall);
        }
        for (int i = 8; i < 11; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 60 + halfWall);
        }
        for (int i = 15; i < 18; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 150 + halfWall);
        }
        for (int i = 22; i < 25; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 60 + halfWall);
        }
    }
    
    }

