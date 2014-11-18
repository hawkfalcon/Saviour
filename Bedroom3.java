import greenfoot.*;

/**
 * Write a description of class Bedroom3 here.
 *
 * @author Manasi Nagtode (layout and some obstacles)
 * @author Poojitha Karumanchi (obstacles)
 * @version (a version number or a date)
 */
public class Bedroom3 extends SaviourLevel {

    /**
     * Constructor for objects of class Bedroom3.
     */
    public Bedroom3() {
        super(90, 70, 815, 500, LevelType.BEDROOM);
        prepare();
    }

    public void prepare() {
        prepareWalls();
        prepareObstacles();
    }

    public void prepareWalls() {
        //top horiz right wall
        for (int i = 1; i < 3; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 480 + halfWall);
        }
        for (int i = 4; i < 10; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 480 + halfWall);
        }
        //second left vert wall
        for (int i = 4; i < 11; i++) {
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        //left vert wall
        for (int i = 8; i < 15; i++) {
            addObject(new Wall(), getWidth() / 6 + halfWall, getPos(i));
        }
        //middle vert wall
        for (int i = 4; i < 6; i++) {
            addObject(new Wall(), getWidth() / 2 + halfWall, getPos(i));
        }
        for (int i = 7; i < 9; i++) {
            addObject(new Wall(), getWidth() / 2 + halfWall, getPos(i));
        }
        for (int i = 10; i < 15; i++) {
            addObject(new Wall(), getWidth() / 2 + halfWall, getPos(i));
        }
        //bottom horiz wall
        for (int i = 6; i < 25; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 180 + halfWall);
        }
        //far right vert wall
        for (int i = 5; i < 20; i++) {
            addObject(new Wall(), getWidth() - 180 + halfWall, getPos(i));
        }
        //middle right vert wall
        for (int i = 1; i < 2; i++) {
            addObject(new Wall(), getWidth() / 3 * 2 + halfWall, getPos(i));
        }
        for (int i = 3; i < 11; i++) {
            addObject(new Wall(), getWidth() / 3 * 2 + halfWall, getPos(i));
        }
    }

    public void prepareObstacles() {        
        //Brick
        addObstacle(new Brick(1), 300, 30, false, 180);
        addObstacle(new Brick(1), 260, 460);
        addObstacle(new Brick(1), 370, 460);
        addObstacle(new Brick(1), 460, 50, false, 90);
        addObstacle(new Brick(1), 460, 460);
        addObstacle(new Brick(1), 550, 460);
        
        //Acid
        addObstacle(new Acid(), 50, 279);
        addObstacle(new Acid(), 135, 382);
        addObstacle(new Acid(), 45, 480);
    
        //Arrows
        addObstacle(new Arrow(), 105, 135, true, 90);
        addObstacle(new Arrow(), 615, 75, true);
        addObstacle(new Arrow(), 466, 194, true, 180);
        addObstacle(new Arrow(), 466, 285, true, 180);
        addObstacle(new Arrow(), 820, 555, true, 270);
        //Spikes
        addObstacle(new Spikes(1),  180, 330, false, 180);
        addObstacle(new Spikes(2), 500, 300, false,180); 
        addObstacle(new Spikes(2), 570, 150, false, 0);
        addObstacle(new Spikes(1),  280, 220, false, 0);
        
        //Spears
        addObstacle(new Spear(), 735, 115, false, 270);
        addObstacle(new Spear(), 615, 315, false, 90); 
        
        //Key
        addObject(new Key1(), 667, 508);
    }
}     