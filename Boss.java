import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends SaviourLevel
{
    /**
     * Constructor for objects of class Boss.
     * 
     */
    public Boss()
    {
        super(450, 450, 450, 100, LevelType.KITCHEN);
        prepare();
        prepareWalls();
        prepareObstacles();
    }
    
    public void prepare()
    {
        Actor king = new King();
        addObject(king, 450, 150);
    }
    
    public void prepareWalls()
    {
        //Left Vertical Wall
        for (int i = 7; i < 14; i++) {
            addObject(new Wall(), (getWidth() / 30) * 5 + halfWall, getPos(i));
        }
        //Middle Left Vertical Wall Pt. 1
        for (int i = 5; i < 7; i++) {
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        //Middle Left Vertical Wall Pt. 2
        for (int i = 8; i < 13; i++){
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        //Middle Left Vertical Wall Pt. 3
        for (int i = 14; i < 16; i++){
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        //Right Vertical Wall
        for (int i = 7; i < 14; i++) {
            addObject(new Wall(), (getWidth() / 30) * 25 + halfWall, getPos(i));
        }
        //Middle Right Vertical Wall Pt. 1
        for (int i = 5; i < 10; i++) {
            addObject(new Wall(), (getWidth() / 3) * 2 + halfWall, getPos(i));
        }
        //Middle Right Vertical Wall Pt. 2
        for (int i = 11; i < 16; i++) {
            addObject(new Wall(), (getWidth() / 3) * 2 + halfWall, getPos(i));
        }
    }
    
    public void prepareObstacles()
    {
        //Triple Arrows in Middle
        addObstacle(new Arrow(), 315, 405, true);
        addObstacle(new Arrow(), 315, 225, true);
        addObstacle(new Arrow(), 615, 315, true, 180);
        
        //Spears on Bottom
        addObstacle(new Spear(), 315, 465, false, 90);
        addObstacle(new Spear(), 615, 465, false, 90);
        
        //Spears on Top
        addObstacle(new Spear(), 315, 135, false, 270);
        addObstacle(new Spear(), 615, 135, false, 270);
        
        //Spikes on Left
        addObstacle(new Spikes(1), 275, 285, false);
        addObstacle(new Spikes(1), 180, 375, false, 180);
        
        //Spikes on Right
        addObstacle(new Spikes(1), 635, 285, false, 180);
        addObstacle(new Spikes(1), 730, 375, false);
    }
    
    public void spawnKey()
    {
        //King dies and you get the key to save your lover
        if (getObjects(King.class) == null)
        {
            Actor key1 = new Key1();
            addObject(key1, 450, 450);
        }
    }
}
