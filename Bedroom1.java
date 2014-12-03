/**
 * Write a description of class Bedroom1 here.
 *
 * @author Manasi Nagtode
 * @author Poojitha Karumanchi
 */
public class Bedroom1 extends SaviourLevel {

    /**
     * Constructor for objects of class Bedroom1.
     */
    public Bedroom1() {
        super(100, 90, 425, 80, LevelType.BEDROOM);
        prepare();
    }

    public void prepare() {
        prepareWalls();
        prepareObstacles();
        addKeys();
    }

    public void prepareWalls() {
        //1st vert wall
        for (int i = 6; i < 8; i++) {
            addObject(new Wall(), getWidth() / 6 + halfWall, getPos(i));
        }
        for (int i = 9; i < 11; i++) {
            addObject(new Wall(), getWidth() / 6 + halfWall, getPos(i));
        }
        for (int i = 12; i < 14; i++) {
            addObject(new Wall(), getWidth() / 6 + halfWall, getPos(i));
        }
        //bottom horizontal wall
        for (int i = 6; i < 15; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 180 + halfWall);
        }
        for (int i = 16; i < 25; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 180 + halfWall);
        }
        //right vet wall
        for (int i = 9; i < 15; i++) {
            addObject(new Wall(), getWidth() - 360 + halfWall, getPos(i));
        }
        //second from bottom horizontal wall
        for (int i = 19; i < 30; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 330 + halfWall);
        }
        // second vert wall
        for (int i = 1; i < 11; i++) {
            if (i != 6) {
                addObject(new Wall(), getWidth() / 3 + 50 + halfWall, getPos(i));
            }
        }
        // top horiz wall
        for (int i = 12; i < 24; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 480 + halfWall);
        }
        for (int i = 8; i < 11; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 60 + halfWall);
        }
        for (int i = 15; i < 18; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 150 + halfWall);
        }
        for (int i = 22; i < 25; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 60 + halfWall);
        }
    }

    public void prepareObstacles() {
        for (int i = 5; i < 15; i += 3) {
           addObstacle(new Arrow(), getWidth() / 6 + halfWall, getPos(i), true, Direction.WEST);
        }
            //Arrows
            addObstacle(new Arrow(), 45, 525, true);
            addObstacle(new Arrow(), 765, 435, true);
            addObstacle(new Arrow(), 465, 435, true, Direction.NORTH);
            addObstacle(new Arrow(), 735, 135, true);
            addObstacle(new Arrow(), 365, 195, true);

            //Bricks
            addObstacle(new Brick(1), 510, 530);
            addObstacle(new Brick(1), 165, 455);
            addObstacle(new Brick(1), 735, 455);
            addObstacle(new Brick(1), 860, 150);

            //Spikes
            addObstacle(new Spikes(2), 500, 365);
            addObstacle(new Spikes(1), 400, 295, false, Direction.WEST);

            //Acid
            addObstacle(new Acid(), 200, 170);
            addObstacle(new Acid(), 240, 170);
            addObstacle(new Acid(), 280, 170);
            addObstacle(new Acid(), 330, 285);
            addObstacle(new Acid(), 290, 285);
            addObstacle(new Acid(), 250, 285);
            addObstacle(new Acid(), 200, 400);
            addObstacle(new Acid(), 240, 400);
            addObstacle(new Acid(), 280, 400);
    }

    public void addKeys() {
        addObject(new Key(), 600, 360);
    }
}