import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SaviourWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SaviourWorld extends World
{

    /**
     * Constructor for objects of class SaviourWorld.
     * 
     */
    public SaviourWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
        setPaintOrder(Solid.class, Obstacle.class);
        setPaintOrder(Fade.class, Solid.class);
        addObject(new Fade(null, false), getWidth()/2, getHeight()/2);   
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    int wallSize = 30;
    int halfWall = wallSize/2;
    private void prepare() {
        Startpoint start = new Startpoint();
        addObject(start, 90, 70);
        Endpoint end = new Endpoint();
        addObject(end, 675, 200);
        Character character = new Character();
        addObject(character, 90, 70);
        prepareWalls();
        addObstacles();
    }

    private void prepareWalls() {
                //top and bottom (horizontal)
        for (int i = 0; i < getWidth()/wallSize ; i++){
            addObject(new Wall(), getPos(i), halfWall);
            addObject(new Wall(), getPos(i), getHeight()-halfWall) ;
        }
        //left and right (verticle)
        for (int i = 1; i < getHeight()/wallSize ; i++) {
            addObject(new Wall(), halfWall, getPos(i)) ;
            addObject(new Wall(), getWidth()-halfWall, getPos(i));
        } 
        //middle shiz
        for (int i = 1; i < 15 ; i++) {
            if (getPos(i) != 255) {
            addObject(new Wall(), getWidth()/2 + halfWall, getPos(i));
        }
        } 
        for (int i = 5; i < 15 ; i++) {
            addObject(new Wall(), (getWidth()/6)*5 - halfWall, getPos(i));
        }
        for (int i = 5; i < 19 ; i++) {
            addObject(new Wall(), (getWidth()/3)*2 + halfWall, getPos(i));
        } 
        for (int i = 5; i < 19 ; i++) {
            addObject(new Wall(), getWidth()/3 + halfWall, getPos(i));
        } 
        for (int i = 1; i < 15 ; i++) {
            addObject(new Wall(), getWidth()/6 + halfWall, getPos(i));
        } 
        for (int i = 21; i < 24 ; i++) {
            addObject(new Wall(), getPos(i), getHeight()/4 + halfWall);
        }         
    }
    
    public int getPos(int i) {
        return wallSize * i + halfWall;
    }
    
    public void addObstacles() {
        addArrow(165, 465, false);
        addArrow(465, 255, true);
        addLauncher(465, 465);
        addObject(new Spear(), 465, 465);
        addObject(new Spikes(2), 573, 300);
        Spikes s = new Spikes(1);
        s.setRotation(180);
        addObject(s, 480, 240);
    }
    
    public void addLauncher(int x, int y) {
       addObject(new Launcher(), x, y);
    }    
    
    public void addArrow(int x, int y, boolean right) {
        Arrow arrow = new Arrow();
        if (right) arrow.turn(180);
        addLauncher(x, y);
        addObject(arrow, x, y);
    }
}
