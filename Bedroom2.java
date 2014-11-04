import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bedroom2 here.
 * 
 * @author Manasi Nagtode (layout)
 * @author Poojitha Karumanchi (obstacles)
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
    
    public void prepareObstacles() {
         
        //Brick
        addObstacle(new Brick(1), 165, 30);
        addObstacle(new Brick(1), 345, 30, false,180);
        addObstacle(new Brick(1), 524, 30, false, 180);
        addObstacle(new Brick(1), 615, 30, false, 180);
        addObstacle(new Brick(1), 594, 300, false, 180);
         
        //Spear
         addObstacle(new Spear(), 255, 15, true, 90);
         addObstacle(new Spear(), 345, 15, true, 90);
         addObstacle(new Spear(), 435, 15, true, 90);
         addObstacle(new Spear(), 615, 15, true, 90);
        
       
         //Acid
         addObstacle(new Acid(), 775, 142); 
         addObstacle(new Acid(), 775, 185);
         addObstacle(new Acid(), 850, 290);
         addObstacle(new Acid(), 850, 330); 
         addObstacle(new Acid(), 850, 550);
         addObstacle(new Acid(), 45, 550);
         addObstacle(new Acid(), 320, 470);
         addObstacle(new Acid(), 430, 400);
         addObstacle(new Acid(), 500, 400);
         
        //Arrows
        addObstacle(new Arrow(), 45, 400, false, 45);
        addObstacle(new Arrow(), 500, 550, false, -45);
        addObstacle(new Arrow(), 195, 405, false, -45);
        addObstacle(new Arrow(), 350, 220, false, 0);
        
        //Spikes
        addObstacle(new Spikes(2), 50, 270, false, 180);
        addObstacle(new Spikes(2), 50, 210, false, 180);
       
        
    }
    
    
}
