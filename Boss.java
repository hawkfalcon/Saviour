import greenfoot.*;

/**
 * Write a description of class Boss here.
 * <p/>
 * Dane created obstacles + layout
 * Leighton edited layout + obstacles
 */
public class Boss extends SaviourLevel {    
    /**
     * Constructor for objects of class Boss.
     */
    public Boss() {
        super(450, 450, 350, 80, LevelType.BOSS);
        prepare();
    }

    public void act(){
    }

    public void prepare() {
        Actor king = new King();
        addObject(king, 450, 220);
        prepareWalls();
        prepareObstacles();
    }

    public void prepareWalls() {
        //Middle Left Vertical Wall
        for (int i = 1; i < 7; i++) {
            addObject(new Wall(), getWidth() / 3 - halfWall, getPos(i));
        }
        //Middle Right Vertical Wall
        for (int i = 1; i < 7; i++) {
            addObject(new Wall(), (getWidth() / 3) * 2 + halfWall, getPos(i));
        }
        //Horizontal Top Wall Left
        for (int i = 10; i < 14; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) - halfWall);
        }
        //Horizontal Top Wall Right
        for (int i = 16; i < 20; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) - halfWall);
        }
    }

    public void prepareObstacles() {
        //adds acid
        addObstacle(new Acid(), 781, 130);
        addObstacle(new Acid(), 141, 130);
        //add spears
        addObstacle(new Spear(), 285, 195, false, Direction.SOUTH);
        addObstacle(new Spear(), 615, 195, false, Direction.SOUTH);
        //adds arrows
        addObstacle(new Arrow(), 45, 465, true);
        addObstacle(new Arrow(), 855, 465, true, Direction.WEST);
        addObstacle(new Arrow(), 730, 225, true, Direction.SOUTHWEST);
        addObstacle(new Arrow(), 170, 225, true, Direction.SOUTHEAST);
        addObstacle(new Arrow(), 170, 370, true);
        addObstacle(new Arrow(), 730, 370, true, Direction.WEST);
        
        //add Key off screen
        addObject(new Key(), 888, 165);
    }
}