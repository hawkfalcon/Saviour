public class Dungeon3 extends SaviourLevel {
    /**
     * Author@ Dane Low
     * Dane constructed this World
     * Leighton added Obstacles all up in this World
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
        prepareObstacles();
        Arrow arrow3 = new Arrow();
        addObject(arrow3, 168, 317);
        arrow3.setRotation(90);
        arrow3.setRotation(180);
        arrow3.setLocation(162, 313);
        Launcher launcher2 = new Launcher();
        addObject(launcher2, 165, 134);
        Launcher launcher3 = new Launcher();
        addObject(launcher3, 166, 314);
        Spear spear = new Spear();
        addObject(spear, 340, 472);
        spear.setRotation(90);
        spear.setLocation(315, 476);
        spear.setLocation(313, 474);
        Spear spear2 = new Spear();
        addObject(spear2, 498, 84);
        spear2.setRotation(270);
        spear2.setLocation(465, 155);
        Arrow arrow4 = new Arrow();
        addObject(arrow4, 28, 507);
        Arrow arrow6 = new Arrow();
        addObject(arrow6, 27, 558);
        arrow6.setLocation(20, 554);
        Wall wall83 = new Wall();
        addObject(wall83, 532, 500);
        wall83.setLocation(525, 494);
        Wall wall84 = new Wall();
        addObject(wall84, 650, 559);
        wall84.setLocation(645, 555);
        wall84.setLocation(644, 555);
        removeObject(arrow4);
        removeObject(arrow6);
        wall83.setLocation(525, 479);
        wall84.setLocation(647, 573);
        wall84.setLocation(646, 573);
        removeObject(arrow3);
        spear.setLocation(312, 463);
        spear.setLocation(312, 465);
        Arrow arrow7 = new Arrow();
        addObject(arrow7, 153, 308);
        arrow7.setLocation(159, 312);
        arrow7.setRotation(180);
        Launcher launcher9 = new Launcher();
        addObject(launcher9, 165, 464);
        Launcher launcher10 = new Launcher();
        addObject(launcher10, 165, 135);
        Arrow arrow9 = new Arrow();
        addObject(arrow9, 174, 141);
        arrow9.setLocation(174, 136);
    }
    
    public void prepareWalls()
    {
        //generates all the walls. 
        //you could just place them and save the world.
        
        //Top Left Wall Horizontal Wall
         for (int i = 1; i < 5; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 1 - halfWall);
        }
        //Bottom Left Horizontal Wall
        for (int i = 1; i < 5; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 3 + halfWall);
        }
        // Middle Left Vertical Wall
        for (int i = 1; i < 15; i++) {
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        // Middle Left Horizontal Wall
        for (int i = 6; i < 10; i++) {
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
        Wall wall = new Wall();
        addObject(wall, 406, 572);
    }
    
    //adds the obstacles
    public void prepareObstacles()
    {
        //adds spikes
        addObstacle(new Spikes(1), 848, 450);
        addObstacle(new Spikes(2), 758, 315, false, 180);
        addObstacle (new Spikes(3), 843, 186);
                
        //adds arrows
        addObstacle(new Arrow(), 169, 466);
        addObstacle (new Arrow(), 16, 526, true, 0);
        
        //remove walls
        
    }
}

