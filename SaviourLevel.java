import greenfoot.*;

/**
 * The main game world: SaviourWorld
 *
 * @author Tristen Miller
 */
public class SaviourLevel extends World {
    /**
     * A class can extend SaviourLevel the same way you extend world.
     * Use a super like super(int xStart, int yStart, int xEnd, int yEnd) in the constructor
     * This sets the endpoint and startpoint.
     * <p/>
     * To set your obstacles, you can use the built in methods:
     * addObstacle(Obstacle obstacle, int x, int y);
     * addObstacle(Obstacle obstacle, int x, int y, boolean launcher);
     * addObstacle(Obstacle obstacle, int x, int y, boolean launcher, int rotation) {
     * addLauncher(int x, int y);
     * <p/>
     * EXAMPLE: addObstacle(new Arrow(), 0, 0);
     */

    int xStart = 90;
    int yStart = 70;
    int xEnd = 675;
    int yEnd = 200;

    /**
     * Constructor for objects of class SaviourLevelManager.
     */
    public SaviourLevel(int xStart, int yStart, int xEnd, int yEnd) {
        // Create a new world with 900x600 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        //initialize variables
        initializeWorld(xStart, yStart, xEnd, yEnd);
        //setup objects
        prepare();
        //make sure obstacles are behind the walls
        setPaintOrder(Solid.class, Obstacle.class);
        //make sure the black fade is in front
        setPaintOrder(Fade.class, Solid.class);
        //fade the world in
        addObject(new Fade(null, false), getWidth() / 2, getHeight() / 2);
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

    private void prepare() {
        addObject(new Startpoint(), xStart, yStart);
        addObject(new Character(), xStart, yStart);
        addObject(new Endpoint(), xEnd, yEnd);
        borderize();
    }

    private void initializeWorld(int xStart, int yStart, int xEnd, int yEnd) {
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
    }

    int wallSize = 30;
    int halfWall = wallSize / 2;

    private void borderize() {
        //top and bottom (horizontal)
        for (int i = 0; i < getWidth() / wallSize; i++) {
            addObject(new Wall(), getPos(i), halfWall);
            addObject(new Wall(), getPos(i), getHeight() - halfWall);
        }
        //left and right (verticle)
        for (int i = 1; i < getHeight() / wallSize; i++) {
            addObject(new Wall(), halfWall, getPos(i));
            addObject(new Wall(), getWidth() - halfWall, getPos(i));
        }
    }

    //get position the wall should be
    public int getPos(int i) {
        return wallSize * i + halfWall;
    }

    //add a non-wall solid object
    public void addLauncher(int x, int y) {
        addObject(new Launcher(), x, y);
    }

    //add an obstacle
    public void addObstacle(Obstacle obstacle, int x, int y) {
        addObject(obstacle, x, y);
    }

    //add both an obstacle and a launcher
    public void addObstacle(Obstacle obstacle, int x, int y, boolean launcher) {
        if (launcher) addLauncher(x, y);
        addObject(obstacle, x + 1, y);
    }

    //add an obstacle and a launcher at a rotation
    public void addObstacle(Obstacle obstacle, int x, int y, boolean launcher, int rotation) {
        if (launcher) addLauncher(x, y);
        obstacle.setRotation(rotation);
        addObstacle(obstacle, x, y);
    }
}
