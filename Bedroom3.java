import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bedroom3 here.
 * 
 * @author Manasi Nagtode (layout)
 * @author Poojitha Karumanchi (obstacles)
 * @version (a version number or a date) 
 */
public class Bedroom3 extends SaviourLevel
{

    /**
     * Constructor for objects of class Bedroom3.
     * 
     */
    public Bedroom3()
    {
        super(90, 70, 675, 200);
        prepare();
        setWalls();
    }
    
    public void prepare()
    {
        setWalls();
        prepareObstacles();
    }
    
    public void setWalls()
    {
        //top horiz right wall
        for (int i = 1; i < 10; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 480 + halfWall);
        }
        //second left vert wall
        for (int i = 4; i < 11; i++) {
            addObject(new Wall(), getWidth() /3 + halfWall, getPos(i));
        }
        //left vert wall
        for (int i = 8; i < 15; i++) {
            addObject(new Wall(), getWidth() /6 + halfWall, getPos(i));
        }
        //third vert wall
        for (int i = 1; i < 15; i++) {
            addObject(new Wall(), getWidth() /2 + halfWall, getPos(i));
        }
        //bottom boriz wall
         for (int i = 6; i < 25; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 180 + halfWall);
        }
        //right vert wall
        for (int i = 5; i < 15; i++) {
            addObject(new Wall(), getWidth() -180 + halfWall, getPos(i));
        }
        for (int i = 20; i < 25; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 480 + halfWall);
        }
         for (int i = 4; i < 11; i++) {
            addObject(new Wall(), getWidth() /3 * 2 + halfWall, getPos(i));
        }
    }
    
    public void prepareObstacles() {
        
        //Brick
        
        //Spear
 
        
        
        //Acid
        
        
        //Arrows
        addObstacle(new Arrow(), 45, 525, true, 0);
        addObstacle(new Arrow(), 345, 135);
        addObstacle(new Arrow(), 345, 320);
        
        //Spikes
       //addObstacle(new Spikes), 850,630);
        
    
    
    
}
}
