/**
 * Write a description of class Bedroom2 here.
 *
 * @author Manasi Nagtode (layout)
 * @author Poojitha Karumanchi (obstacles)
 * @version (a version number or a date)
 */
public class Bedroom2 extends SaviourLevel {

    /**
     * Constructor for objects of class Bedroom2.
     */
    public Bedroom2() {
        super(75, 75, 675, 200, LevelType.BEDROOM);
        prepare();
    }

    public void prepare() {
        prepareWalls();
        prepareObstacles();
    }

    public void prepareWalls() {
        // top horiz wall
        for (int i = 1; i < 25; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 480 + halfWall);
        }
        //right vert wall
        for (int i = 4; i < 14; i++) {
            addObject(new Wall(), getWidth() - 180 + halfWall, getPos(i));
        }
        //Bottom horiz wall
        for (int i = 5; i < 24; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 180 + halfWall);
        }
        //left vert wall
        for (int i = 9; i < 15; i++) {
            addObject(new Wall(), getWidth() / 6 + halfWall, getPos(i));
        }
        for (int i = 5; i < 7; i++) {
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        for (int i = 8; i < 10; i++) {
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        for (int i = 9; i < 15; i++) {
            addObject(new Wall(), getWidth() / 2 + halfWall, getPos(i));
        }
        for (int i = 5; i < 10; i++) {
            addObject(new Wall(), getWidth() / 2 + 130 + halfWall, getPos(i));
        }
    }

    public void prepareObstacles() {

        //Brick
        addObstacle(new Brick(1), 165, 30);
        addObstacle(new Brick(1), 345, 30, false, Direction.WEST);
        addObstacle(new Brick(1), 524, 30, false, Direction.WEST);
        addObstacle(new Brick(1), 615, 30, false, Direction.WEST);
        addObstacle(new Brick(1), 594, 300, false, Direction.WEST);

        //Spear
        addObstacle(new Spear(), 255, 15, false, Direction.SOUTH);
        addObstacle(new Spear(), 345, 15, false, Direction.SOUTH);
        addObstacle(new Spear(), 435, 15, false, Direction.SOUTH);
        addObstacle(new Spear(), 615, 15, false, Direction.SOUTH);

        //Acid
        addObstacle(new Acid(), 775, 142);
        addObstacle(new Acid(), 775, 185);
        addObstacle(new Acid(), 850, 290);
        addObstacle(new Acid(), 850, 330);
        addObstacle(new Acid(), 850, 550);
        addObstacle(new Acid(), 45, 550);
        addObstacle(new Acid(), 320, 470);
        addObstacle(new Acid(), 430, 400);
        addObstacle(new Acid(), 500, 400);

        //Arrows
        addObstacle(new Arrow(), 45, 400, true, Direction.SOUTHEAST);
        addObstacle(new Arrow(), 500, 555, true, Direction.NORTHEAST);
        addObstacle(new Arrow(), 195, 405, true, Direction.NORTHEAST);
        addObstacle(new Arrow(), 315, 225, true);
        addObstacle(new Arrow(), 735, 435, true, Direction.SOUTHEAST);

        //Spikes
        addObstacle(new Spikes(2), 50, 270, false, Direction.WEST);
        addObstacle(new Spikes(2), 50, 210, false, Direction.WEST);

    }

}

