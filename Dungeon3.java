/**
 * @author Dane (Layout)
 * @author Leighton (Obstacle)
 */

public class Dungeon3 extends SaviourLevel {

    public Dungeon3() {
        super(90, 70, 675, 200, LevelType.DUNGEON);
        prepare();
    }

    public void prepare() {
        prepareWalls();
        prepareObstacles();
    }

    public void prepareWalls() {
        //Top Left Wall Horizontal Wall
        for (int i = 1; i < 5; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) - halfWall);
        }
        //Bottom Left Horizontal Wall
        for (int i = 1; i < 5; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 3 + halfWall);
        }
        // Middle Left Vertical Wall
        for (int i = 1; i < 15; i++) {
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        // Middle Left Horizontal Wall
        for (int i = 6; i < 10; i++) {
            addObject(new Wall(), getPos(i), getHeight() / 2 + halfWall);
        }
        //Long Bottom Wall
        for (int i = 10; i < 24; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 3 + halfWall);
        }
        //Far Left Vertical Wall
        for (int i = 5; i < 16; i++) {
            addObject(new Wall(), (getWidth() / 15) * 12 + halfWall, getPos(i));
        }
        //Top Right Horizontal Wall
        for (int i = 15; i < 25; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) - halfWall);
        }
        // Middle Vertical Wall
        for (int i = 5; i < 12; i++) {
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

        //Add walls
        addObject(new Wall(), 406, 572);
        addObject(new Wall(), 525, 480);
        addObject(new Wall(), 645, 575);
    }

    public void prepareObstacles() {
        //adds spikes
        addObstacle(new Spikes(1), 848, 450);
        addObstacle(new Spikes(2), 758, 315, false, Direction.WEST);
        addObstacle(new Spikes(3), 843, 186);

        //adds arrows
        addObstacle(new Arrow(), 165, 465, true);
        addObstacle(new Arrow(), 45, 525, true);
        addObstacle(new Arrow(), 165, 315, true, Direction.WEST);
        addObstacle(new Arrow(), 165, 135, true);

        //adds spears
        addObstacle(new Spear(), 315, 465, false, Direction.SOUTH);
        addObstacle(new Spear(), 465, 150, false, Direction.NORTH);
        addObstacle(new Spear(), 465, 0, false, Direction.SOUTH);

        //adds acid
        addObstacle(new Acid(), 420, 360);

        //adds bricks
        addObstacle(new Brick(1), 495, 185);
        addObstacle(new Brick(2), 705, 275);
    }
}