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
        super(75, 75, 810, 530, LevelType.BEDROOM);
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
        addObstacle(new Brick(1), 300, 30, false, Direction.WEST);
        addObstacle(new Brick(1), 460, 50, false, Direction.SOUTH);
        addObstacle(new Brick(1), 165, 460);
        addObstacle(new Brick(2), 265, 460);
        addObstacle(new Brick(1), 365, 460);
        addObstacle(new Brick(2), 465, 460);
        addObstacle(new Brick(1), 565, 460);
        
        //Acid
        addObstacle(new Acid(), 50, 280);
        addObstacle(new Acid(), 135, 380);
        addObstacle(new Acid(), 45, 480);
    
        //Arrows
        addObstacle(new Arrow(), 105, 135, true, Direction.SOUTH);
        addObstacle(new Arrow(), 615, 75, true);
        addObstacle(new Arrow(), 465, 195, true, Direction.WEST);
        addObstacle(new Arrow(), 465, 285, true, Direction.WEST);
        addObstacle(new Arrow(), 765, 555, true, Direction.NORTH);
        addObstacle(new Arrow(), 855, 555, true, Direction.NORTH);
        //Spikes
        addObstacle(new Spikes(1), 180, 330, false, Direction.WEST);
        addObstacle(new Spikes(2), 500, 300, false, Direction.WEST); 
        addObstacle(new Spikes(2), 570, 150, false);
        addObstacle(new Spikes(1), 280, 220, false);
        
        //Spears
        addObstacle(new Spear(), 735, 115, false, Direction.NORTH);
        addObstacle(new Spear(), 615, 315, false, Direction.SOUTH); 
        
        //Key
        addObject(new Key1(), 667, 508);
    }
}     