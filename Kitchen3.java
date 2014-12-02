/**
 * @author Dane (Layout)
 * @author Dane (Obstacle)
 */

public class Kitchen3 extends SaviourLevel {

    public Kitchen3() {
        super(90, 70, 825, 230, LevelType.KITCHEN);
        prepareWalls();
        prepareObstacles();
        addKeys();
    }

    public void prepareWalls() {
        //Top Left Horizontal Wall
        for (int i = 1; i < 10; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) - halfWall);
        }
        //Top Right Horizontal Wall pt 1
        for (int i = 15; i < 19; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 30) * 9 - halfWall);
        }
        //Top Right Horizontal Wall pt 2
        for (int i = 23; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 30) * 9 - halfWall);
        }
        //Bottom Left Vertical Wall
        for (int i = 10; i < 16; i++) {
            addObject(new Wall(), (getWidth() / 30) * 5 + halfWall, getPos(i));
        }
        // Middle Vertical Wall
        for (int i = 10; i < 15; i++) {
            addObject(new Wall(), (getWidth() / 30) * 14 + halfWall, getPos(i));
        }
        // Middle Left Horizontal Wall
        for (int i = 6; i < 10; i++) {
            addObject(new Wall(), getPos(i), getHeight() / 2 + halfWall);
        }
        //Long Bottom Wall Part 1
        for (int i = 6; i < 11; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 3 + halfWall);
        }
        //Long Bottom Wall Part 2
        for (int i = 20; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 3 + halfWall);
        }
        //Middle Right Vertical Wall
        for (int i = 11; i < 15; i++) {
            addObject(new Wall(), (getWidth() / 30) * 20 + halfWall, getPos(i));
        }
        //Middle Far Right Vertical wall
        for (int i = 5; i < 11; i++) {
            addObject(new Wall(), (getWidth() / 30) * 25 + halfWall, getPos(i));
        }

        //Add other walls
        addObject(new Wall(), 435, 195);
        addObject(new Wall(), 435, 255);
        addObject(new Wall(), 435, 465);
        addObject(new Wall(), 615, 165);
        addObject(new Wall(), 645, 165);

        // Spike Walls
        for (int i = 10; i < 16; i++) {
            addObject(new Wall(), (getWidth() / 30) * 15 + halfWall, getPos(i));
        }
        for (int i = 11; i < 16; i++) {
            addObject(new Wall(), (getWidth() / 30) * 19 + halfWall, getPos(i));
        }
    }

    public void prepareObstacles() {
        //All the middle arrows
        addObstacle(new Arrow(), 435, 165, true, Direction.WEST);
        addObstacle(new Arrow(), 435, 225, true, Direction.WEST);
        addObstacle(new Arrow(), 435, 285, true, Direction.WEST);
        addObstacle(new Arrow(), 405, 465, true, Direction.NORTH);
        addObstacle(new Arrow(), 345, 465, true, Direction.NORTH);
        addObstacle(new Arrow(), 375, 465, true, Direction.SOUTH);

        //Only two spikes on the level
        addObstacle(new Spikes(2), 475, 345, false, Direction.WEST);
        addObstacle(new Spikes(2), 575, 425, false);

        //Left side obstacles
        addObstacle(new Spear(), 35, 390, false);
        addObstacle(new Acid(), 120, 345, false);

        //Right side Obstacles
        addObstacle(new Arrow(), 585, 165, true, Direction.NORTH);
        addObstacle(new Arrow(), 675, 165, true, Direction.NORTH);
        addObstacle(new Spear(), 850, 375, false, Direction.WEST);
        addObstacle(new Acid(), 725, 360, false);
    }

    public void addKeys() {
        addObject(new Key1(), 800, 85);
        addObject(new Key2(), 800, 525);
    }
}