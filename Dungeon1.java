import greenfoot.*;

/**
 * The main game world: SaviourWorld
 *
 * @author Tristen Miller
 */

public class Dungeon1 extends SaviourLevelManager {

    /**
     * Constructor for objects of class Dungeon1.
     * 
     */
    public Dungeon1() {
       super(90, 70, 675, 200);
       prepare();       
    }
    
    public void prepare() {
        prepareWalls();
        prepareObstacles();
    }
    
    public void prepareWalls() {
        //middle shiz
        for (int i = 1; i < 15; i++) {
            if (getPos(i) != 255) {
                addObject(new Wall(), getWidth() / 2 + halfWall, getPos(i));
            }
        }
        for (int i = 5; i < 15; i++) {
            addObject(new Wall(), (getWidth() / 6) * 5 - halfWall, getPos(i));
        }
        for (int i = 5; i < 19; i++) {
            addObject(new Wall(), (getWidth() / 3) * 2 + halfWall, getPos(i));
        }
        for (int i = 5; i < 19; i++) {
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        for (int i = 1; i < 15; i++) {
            addObject(new Wall(), getWidth() / 6 + halfWall, getPos(i));
        }
        for (int i = 21; i < 24; i++) {
            addObject(new Wall(), getPos(i), getHeight() / 4 + halfWall);
        }
    }
    
        
    //add the obstacles
    public void prepareObstacles() {
        addArrow(165, 465, false);
        addArrow(465, 255, true);
        addLauncher(465, 465);
        addObject(new Spear(), 465, 465);
        addObject(new Spikes(2), 573, 300);
        Spikes s = new Spikes(1);
        s.setRotation(180);
        addObject(s, 480, 240);
    }
        
}
