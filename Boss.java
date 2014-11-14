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
        super(450, 450, 450, 100, LevelType.KITCHEN);
        prepare();

    }

    public void prepare() {
        Actor king = new King();
        addObject(king, 450, 150);
        prepareWalls();
        prepareObstacles();
        spawnKeys();
        kingsDeath();
    }

    public void prepareWalls() {
        //Left Vertical Wall
        for (int i = 7; i < 14; i++) {
            addObject(new Wall(), (getWidth() / 30) * 5 + halfWall, getPos(i));
        }
        //Middle Left Vertical Wall Pt. 1
        for (int i = 1; i < 7; i++) {
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        //Middle Left Vertical Wall Pt. 2
        for (int i = 8; i < 13; i++) {
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        //Middle Left Vertical Wall Pt. 3
        for (int i = 14; i < 15; i++) {
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        //Right Vertical Wall
        for (int i = 7; i < 14; i++) {
            addObject(new Wall(), (getWidth() / 30) * 25 + halfWall, getPos(i));
        }
        //Middle Right Vertical Wall Pt. 1
        for (int i = 1; i < 10; i++) {
            addObject(new Wall(), (getWidth() / 3) * 2 + halfWall, getPos(i));
        }
        //Middle Right Vertical Wall Pt. 2
        for (int i = 11; i < 15; i++) {
            addObject(new Wall(), (getWidth() / 3) * 2 + halfWall, getPos(i));
        }
        //Horizontal Top Wall Left
        for (int i = 11; i < 14; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 3) - halfWall);
        }
        //Horizontal Top Wall Right
        for (int i = 17; i < 20; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 3) - halfWall);
        }
    }

    public void prepareObstacles() {
        //Triple Arrows in Middle
        addObstacle(new Arrow(), 315, 405, true);
        addObstacle(new Arrow(), 315, 225, true);
        addObstacle(new Arrow(), 615, 315, true, 180);

        //Spears on Bottom
        addObstacle(new Spear(), 315, 435, false, 90);
        addObstacle(new Spear(), 615, 435, false, 90);

        //Spikes on Left
        addObstacle(new Spikes(1), 275, 285, false);
        addObstacle(new Spikes(1), 180, 375, false, 180);

        //Spikes on Right
        addObstacle(new Spikes(1), 635, 285, false, 180);
        addObstacle(new Spikes(1), 730, 375, false);
    }

    public void spawnKeys() {
        addObject(new Key1(), 232, 326);
        addObject(new Key2(), 694, 324);
    }

    public void kingsDeath() {
        //King dies and you get the key to save your lover
        if (getObjects(King.class) == null) {
            Actor key1 = new Key1();
            addObject(key1, 450, 450);
        }
    }
}
