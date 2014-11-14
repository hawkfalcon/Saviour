/**
 * @author Tristen Miller (Layout)
 * @author Tristen Miller (Obstacle)
 */

public class Dungeon1 extends SaviourLevel {

    public Dungeon1() {
        //int xStart, int yStart, int xEnd, int yEnd
        super(90, 70, 675, 200, LevelType.DUNGEON);
        prepare();
    }

    public void prepare() {
        prepareWalls();
        prepareObstacles();
    }

    public void prepareWalls() {
        //Middle Wall
        for (int i = 1; i < 15; i++) {
            if (getPos(i) != 255) {
                addObject(new Wall(), getWidth() / 2 + halfWall, getPos(i));
            }
        }
        //Far Right Wall
        for (int i = 5; i < 15; i++) {
            addObject(new Wall(), (getWidth() / 6) * 5 - halfWall, getPos(i));
        }
        //Middle Right Wall
        for (int i = 5; i < 19; i++) {
            addObject(new Wall(), (getWidth() / 3) * 2 + halfWall, getPos(i));
        }
        //Middle Left Wall
        for (int i = 5; i < 19; i++) {
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        //Far Left Wall
        for (int i = 1; i < 15; i++) {
            addObject(new Wall(), getWidth() / 6 + halfWall, getPos(i));
        }
        // Little Wall Above End Point
        for (int i = 21; i < 24; i++) {
            addObject(new Wall(), getPos(i), getHeight() / 4 + halfWall);
        }
    }

    //add the obstacles
    //addObstacle(Obstacle obstacle, int x, int y, boolean launcher, int rotation);
    public void prepareObstacles() {
        //adds arrows
        addObstacle(new Arrow(), 165, 465, true);
        addObstacle(new Arrow(), 465, 255, true, 180);

        //adds spear
        addObstacle(new Spear(), 465, 465, true, 90);

        //adds spikes
        addObstacle(new Spikes(2), 573, 300);
        addObstacle(new Spikes(1), 480, 240, false, 180);
    }
}