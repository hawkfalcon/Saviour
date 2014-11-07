import greenfoot.*;

/**
 * Write a description of class Bedroom1 here.
 *
 * @author Manasi Nagtode
 * @author Poojitha Karumanchi
 * 
 */
public class Bedroom1 extends SaviourLevel {

    /**
     * Constructor for objects of class Bedroom1.
     */
    public Bedroom1() {
        super(90, 70, 675, 200, LevelType.BEDROOM);
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
        for (int i = 4; i < 15; i++) {
            addObject(new Wall(), getWidth() - 360 + halfWall, getPos(i));
        }
        //second from bottom horizontal wall
        for (int i = 19; i < 30; i++) {
            addObject(new Wall(), getPos(i), getHeight() - 330 + halfWall);
        }
        // second vert wall
        for (int i = 1; i < 11; i++) {
            addObject(new Wall(), getWidth() / 3 + 50 + halfWall, getPos(i));
        }
        // top horiz wall
        for (int i = 19; i < 24; i++) {
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
            //Arrows
            addObstacle(new Arrow(), getWidth() / 6 + halfWall, getPos(i), true, 180);
            addObstacle(new Arrow(), 3 * halfWall, getPos(17), true, 0);
            addObstacle(new Arrow(), 765, 435,true);
            addObstacle(new Arrow(), 465, 435, true, 270);
            addObstacle(new Arrow(), 735, 135, true);

            //Bricks
            addObstacle(new Brick(1), 510, 530);
            addObstacle(new Brick(1), 165, 455);
            addObstacle(new Brick(1), 735, 455);
            addObstacle(new Brick(1), 860, 150);

            //Spikes
            addObstacle(new Spikes(2), 500, 180);
            addObstacle(new Spikes(1), 400, 120, false, 180);

            //Acid
            addObstacle(new Acid(), 200, 172);
            addObstacle(new Acid(), 240, 172);
            addObstacle(new Acid(), 280, 172);
            addObstacle(new Acid(), 330, 285);
            addObstacle(new Acid(), 280, 285);
            addObstacle(new Acid(), 250, 285);
            addObstacle(new Acid(), 200, 395);
            addObstacle(new Acid(), 200, 400);


            //Spear


        }
    }

    public void addKeys() {
        addObject(new Key1(), 600, 360);
    }
}
