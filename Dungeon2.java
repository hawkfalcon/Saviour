import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dungeon2 here.
 * Layout of Dungeon 2
 * @author Manasi Nagtode (layout)
 * Obstacles of Dungeon 2
 * @author Poojitha Karumanchi (obstacles)
 * @version 1 Oct 21, 2014
 */
public class Dungeon2 extends SaviourLevel
{

    /**
     * Constructor for objects of class Dungeon2.
     * 
     */
    public Dungeon2()
    {
        super(90, 70, 675, 200, LevelType.DUNGEON);
        prepare();
    }

    public void prepare() {
        prepareWalls();
        prepareObstacles();
    }

    public void prepareWalls() {
        //for (int i = 1; i < 15; i++) {
        //    if (getPos(i) != 255) {
        //        addObject(new Wall(), getWidth() / 2 + halfWall, getPos(i));  
        //    }
        //}
        //third vert line

        // first vertical wall
        for (int i = 1; i < 8; i++) {
            addObject(new Wall(), getWidth() / 6 - halfWall, getPos(i));
        }
        for (int i = 9; i < 15; i++) {
            addObject(new Wall(), getWidth() / 6 - halfWall, getPos(i));
        }
        //second vertical wall
        for (int i = 6; i < 19; i++) {
            addObject(new Wall(), getWidth() / 4 + halfWall, getPos(i));
        }
        //third vertical wall
        for (int i = 1; i < 4; i++){
            addObject(new Wall(), ((getWidth() / 3) + 40), getPos(i));
        }
        for (int i = 5; i < 15; i++){
            addObject(new Wall(), ((getWidth() / 3) + 40), getPos(i));
        }
        //fourth vertical
        for (int i = 5; i < 19; i++) {
            addObject(new Wall(), getWidth() / 2 + halfWall, getPos(i));
        }
        // fifth vertical wall line
        for (int i = 5; i < 15; i++) {
            addObject(new Wall(), (getWidth() / 5) * 4 - halfWall, getPos(i));
        }
        //horizontal right top-most wall
        for (int i = 15; i < 24; i++) {
            addObject(new Wall(),  getPos(i), ((getHeight() / 5) + 0) + halfWall);
        }
        // hortizontal right bottom-most wall
        for (int i = 19; i < 24; i++) {
            addObject(new Wall(), getPos(i), ((getHeight() / 5) * 4 - 30) + halfWall);
        }
        //horizontal second from bottom wall
        for (int i = 16; i < 20; i++) {
            addObject(new Wall(), getPos(i), ((getHeight() / 2) + 30) + halfWall);
        }
        // horizontal second from top wall
        for (int i = 19; i < 24; i++) {
            addObject(new Wall(), getPos(i), ((getHeight() / 3) + 55) );
        }
    }

    public void prepareObstacles() {
        addObstacle(new Arrow(),getWidth() / 6 - halfWall, getPos(15), true,180); 
        addObstacle(new Arrow(),getWidth() / 6 - halfWall, getPos(8), true, 180);
        addObstacle(new Arrow(),getWidth() / 4 + halfWall, getPos(5), true, -90);
        addObstacle(new Spikes(2), 500, 300, false, 180);
        addObstacle(new Spikes(1), ((getWidth() / 3) + -0), 480, false);
        addObstacle(new Arrow(), ((getWidth() / 3) + 40), getPos(4), true);
        addObstacle(new Spear(), getPos(23),((getHeight() / 5) * 4 - 30) + halfWall, false, 90);

    }
}
