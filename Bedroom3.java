import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bedroom3 here.
 * 
 * @author Manasi Nagtode (layout and some obstacles)
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
        super(90, 70, 675, 200, LevelType.BEDROOM);
        prepare();
    }

    public void prepare()
    {
        prepareWalls();
        prepareObstacles();
    }

    public void prepareWalls()
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
        addObstacle(new Brick(1), 300, 30, false,180);
        addObstacle(new Brick(1), 260, 460);
        addObstacle(new Brick(1), 370, 460);

        addObstacle(new Brick(1), 610, 50, false, 90);
        addObstacle(new Brick(1), 740, 50, false, 90);

        addObstacle(new Brick(1), 300, 30, false,180);
        addObstacle(new Brick(1), 260, 460);
        addObstacle(new Brick(1), 370, 460);




        addObstacle(new Brick(1), 300, 30, false,180);
        addObstacle(new Brick(1), 260, 460);
        addObstacle(new Brick(1), 370, 460);



        addObstacle(new Acid(), 50, 170); 

        addObstacle(new Acid(), 765, 142);
        addObstacle(new Acid(), 765, 180);
        addObstacle(new Acid(), 765, 220);
        addObstacle(new Acid(), 850, 440);
        addObstacle(new Acid(), 850, 410);
        addObstacle(new Acid(), 850, 370);
        addObstacle(new Acid(), 850, 340);


        addObstacle(new Acid(), 50, 170); 


        //Arrows
        addObstacle(new Arrow(), 45, 525, true);
        addObstacle(new Arrow(), 345, 135,true);
        addObstacle(new Arrow(), 345, 314, true);



        addObstacle(new Acid(), 50, 170);         

        //Arrows
        addObstacle(new Arrow(), 45, 525, true, 0);
        addObstacle(new Arrow(), 345, 135);
        addObstacle(new Arrow(), 345, 320);       
        //Spikes


        addObstacle(new Spikes(1),  200, 320, false, 180);
        addObstacle(new Spikes(1),  270, 220, false, 0);
       //addObstacle(new Spikes), 850,630);
        

        //Spikes
        addObstacle(new Spikes(1),  200, 335, false, 180);
        addObstacle(new Spikes(1),  270, 210, false, 0);
        //addObstacle(new Spikes), 850,630);


        addObstacle(new Spikes(2), 500, 300, false,180); 
        addObstacle(new Spikes(2), 570, 150, false, 0);

        //addObstacle(new Spikes), 850,630);

        addObstacle(new Spikes(1),  200, 320, false, 180);
        addObstacle(new Spikes(1),  270, 220, false, 0);
        //addObstacle(new Spikes), 850,630);
    
    
    }
  }     



