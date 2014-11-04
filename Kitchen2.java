import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kitchen2 here.
 * 
 * Leighton made the walls/obstacles 
 * 
 */
public class Kitchen2 extends SaviourLevel
{
    /**
     * Constructor for objects of class Kitchen2.
     * 
     */
    public Kitchen2()
    {
        super(90, 70, 675, 200, LevelType.KITCHEN);
        prepare();
    }

    public void prepare()
    {
        prepareWalls();
        prepareObstacles();
    }

    //adds the walls
    public void prepareWalls()
    {
        //generates all the walls
        
        //Top horizontal wall(Left)
        for (int i = 1; i < 12; i++)
        {
            addObject(new Wall(), getPos(i),(getHeight() / 4) * 1 - halfWall);
        }
        //Top horizontal wall(Right)
        for (int i =13; i < 25; i++)
        {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 1 - halfWall);
        }
        //Left bottom horizontal wall
        for (int i = 5; i < 8; i++)
        {
            addObject(new Wall(), getPos(i),(getHeight() / 29) * 24 - halfWall);
        }
        //Mid left bottom horizontal wall
        for (int i = 9; i < 18; i++)
        {
            addObject(new Wall(), getPos(i),(getHeight() / 29) * 24 - halfWall);
        }
        //Right bottom horizontal wall
        for (int i = 19; i < 25; i++)
        {
            addObject(new Wall(), getPos(i), (getHeight() / 29) * 24 - halfWall);  
        }
        //Left vertical wall
        for (int i = 8; i < 15; i ++)
        {
            addObject(new Wall(), (getWidth() / 30) * 5 + halfWall, getPos(i));
        }
        //Mid left vertical wall
        for(int i = 5; i < 12; i++)
        {
            addObject(new Wall(),(getWidth() / 30) * 10 + halfWall, getPos(i));
        }
        //Mid vertical wall
        for(int i = 8; i < 15; i++)
        {
            addObject(new Wall(),(getWidth() / 30) * 15 + halfWall, getPos(i));
        }
        //Mid far right vertical wall
        for(int i = 5; i < 12; i++)
        {
            addObject(new Wall(),(getWidth() / 30) * 20 + halfWall, getPos(i));
        }
        //Far Right Vertical wall
        for (int i = 4; i < 15; i++) {
            addObject(new Wall(), (getWidth() / 30 ) * 24 + halfWall, getPos(i));
        }
    }

    //adds the obstacles
    public void prepareObstacles()
    {
        //add spears
        addObstacle(new Spear(), 165, 225, false, 270);
        addObstacle(new Spear(), 315, 343, false, 90);
        addObstacle(new Spear(), 465, 220, false, 270);
        addObstacle(new Spear(), 615, 350, false, 90);
        
        //add acid
        addObstacle(new Acid(), 50, 260);
        addObstacle(new Acid(), 125, 375);
        addObstacle(new Acid(), 725, 563);
        addObstacle (new Acid(), 525, 484);
        addObstacle(new Acid(), 325, 562);
        addObstacle(new Acid(), 175, 485);
        
        //add arrow
        addObstacle(new Arrow(), 856, 526, true, 180);
        addObstacle(new Arrow(), 89, 555, true, 270);
        addObstacle(new Arrow(), 255, 465, true, 270);
        addObstacle(new Arrow(), 375, 135, true, 90);
        addObstacle(new Arrow(), 555, 465, true, 270);
        
        //add spikes
        addObstacle(new Spikes(1), 845, 195, false);
        addObstacle(new Spikes(2), 753, 300, false, 180);
        addObstacle(new Spikes(3), 845, 445, false);
    }
}
