public class Dungeon3 extends SaviourLevel {
    /**
     * Author@ Dane Low
     * Dane constructed this World
     */
    /**
     * Constructor for objects of class Dungeon3.
     */
    public Dungeon3() {
        super(90, 70, 675, 200);
        prepare();
    }
    
    public void prepare()
    {
        prepareWalls();
    }
    
    public void prepareWalls()
    {
        //generates all the walls. 
        //you could just place them and save the world.
        
        //Top Left Wall Horizontal Wall
         for (int i = 1; i < 6; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 1 - halfWall);
        }
        //Bottom Left Horizontal Wall
        for (int i = 1; i < 6; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 3 + halfWall);
        }
        // Middle Left Vertical Wall
        for (int i = 1; i < 15; i++) {
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        // Middle Left Horizontal Wall
        for (int i = 5; i < 11; i++) {
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
        for (int i = 16; i < 24; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) + halfWall);
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
    }
}

