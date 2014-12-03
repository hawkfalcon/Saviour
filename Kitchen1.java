/**
 * @author Dane (Layout)
 * @author Leighton (Obstacle)
 */
public class Kitchen1 extends SaviourLevel {

    public Kitchen1() {
        super(70, 75, 675, 200, LevelType.KITCHEN);
        prepare();
    }

    public void prepare() {
        prepareWalls();
        prepareObstacles();
    }

    public void prepareWalls() {
        //Top Horizontal Wall
        for (int i = 1; i < 25; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) - halfWall);
        }
        //Bottom Left Vertical Wall
        for (int i = 10; i < 16; i++) {
            addObject(new Wall(), (getWidth() / 30) * 5 + halfWall, getPos(i));
        }
        // Middle Left Vertical Wall
        for (int i = 10; i < 15; i++) {
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        // Middle Left Horizontal Wall
        for (int i = 7; i < 9; i++) {
            addObject(new Wall(), getPos(i), getHeight() / 2 + halfWall);
        }
        //Long Bottom Wall
        for (int i = 10; i < 24; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 3 + halfWall);
        }
        //Far Right Vertical Wall
        for (int i = 5; i < 16; i++) {
            addObject(new Wall(), (getWidth() / 15) * 12 + halfWall, getPos(i));
        }
        // Middle Vertical Wall pt.1
        for (int i = 6; i < 9; i++) {
            addObject(new Wall(), (getWidth() / 30) * 15 + halfWall, getPos(i));
        }
        //Mid Vert pt.2
        for (int i = 10; i < 13; i++) {
            addObject(new Wall(), (getWidth() / 30) * 15 + halfWall, getPos(i));
        }
        //Middle Horizontal Wall
        for (int i = 15; i < 19; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 30) * 18 + halfWall);
        }
        //Middle Right Horizontal Wall
        for (int i = 19; i < 25; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 30) * 12 + halfWall);
        }
    }

    public void prepareObstacles() {
        //adds the arrows
        addObstacle(new Arrow(), 195, 315, true, Direction.SOUTH);
        addObstacle(new Arrow(), 285, 315, true, Direction.SOUTH);
        addObstacle(new Arrow(), 465, 285, true, Direction.WEST);
        addObstacle(new Arrow(), 465, 165, true, Direction.WEST);

        //adds the walls
        addObject(new Wall(), 240, 496);
        addObject(new Wall(), 240, 525);
        addObject(new Wall(), 240, 555);

        //adds spears
        addObstacle(new Spear(), 735, 465, false, Direction.SOUTH);
        addObstacle(new Spear(), 50, 345, false);

        //adds acids
        addObstacle(new Acid(), 123, 280);
        addObstacle(new Acid(), 174, 280);
        addObstacle(new Acid(), 174, 236);
        addObstacle(new Acid(), 354, 322);
        addObstacle(new Acid(), 283, 215);
        addObstacle(new Acid(), 283, 171);

        //adds spikes
        addObstacle(new Spikes(1), 850, 285);
        addObstacle(new Spikes(2), 750, 350, false, Direction.WEST);
    }
}