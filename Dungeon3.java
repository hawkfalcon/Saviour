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
        Arrow arrow = new Arrow();
        addObject(arrow, 172, 469);
        arrow.setLocation(169, 466);
        Arrow arrow2 = new Arrow();
        addObject(arrow2, 174, 140);
        arrow2.setLocation(165, 133);
        Arrow arrow3 = new Arrow();
        addObject(arrow3, 168, 317);
        arrow3.setRotation(90);
        arrow3.setRotation(180);
        arrow3.setLocation(162, 313);
        Launcher launcher2 = new Launcher();
        addObject(launcher2, 172, 140);
        launcher2.setLocation(165, 134);
        Launcher launcher3 = new Launcher();
        addObject(launcher3, 172, 321);
        launcher3.setLocation(165, 314);
        launcher3.setLocation(165, 314);
        Launcher launcher4 = new Launcher();
        addObject(launcher4, 172, 475);
        launcher4.setLocation(165, 465);
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
        Arrow arrow5 = new Arrow();
        addObject(arrow5, 44, 536);
        arrow5.setLocation(26, 531);
        arrow4.setLocation(18, 499);
        arrow5.setLocation(20, 527);
        Arrow arrow6 = new Arrow();
        addObject(arrow6, 27, 558);
        arrow6.setLocation(20, 554);
        Launcher launcher5 = new Launcher();
        addObject(launcher5, 23, 502);
        launcher5.setLocation(16, 496);
        Launcher launcher6 = new Launcher();
        addObject(launcher6, 22, 533);
        launcher6.setLocation(16, 526);
        Launcher launcher7 = new Launcher();
        addObject(launcher7, 22, 562);
        launcher7.setLocation(15, 555);
        launcher6.setLocation(16, 526);
        launcher5.setLocation(15, 496);
        Wall wall81 = new Wall();
        addObject(wall81, 430, 557);
        wall81.setLocation(405, 555);
        Wall wall82 = new Wall();
        addObject(wall82, 444, 530);
        wall82.setLocation(437, 527);
        removeObject(wall82);
        Wall wall83 = new Wall();
        addObject(wall83, 532, 500);
        wall83.setLocation(525, 494);
        Wall wall84 = new Wall();
        addObject(wall84, 650, 559);
        wall84.setLocation(645, 555);
        wall84.setLocation(644, 555);
        launcher3.setLocation(155, 368);
        launcher3.setLocation(165, 314);
        launcher2.setLocation(172, 176);
        removeObject(launcher2);
        removeObject(arrow2);
        launcher4.setLocation(169, 511);
        launcher4.setLocation(165, 466);
        removeObject(arrow4);
        removeObject(launcher5);
        removeObject(arrow6);
        removeObject(launcher7);
        wall81.setLocation(405, 570);
        wall83.setLocation(525, 479);
        wall84.setLocation(647, 573);
        wall84.setLocation(646, 573);
        launcher3.setLocation(166, 314);
        removeObject(launcher3);
        removeObject(arrow3);
        removeObject(launcher4);
        removeObject(arrow);
        spear.setLocation(312, 463);
        spear.setLocation(312, 465);
        Launcher launcher8 = new Launcher();
        addObject(launcher8, 172, 319);
        launcher8.setLocation(165, 313);
        Arrow arrow7 = new Arrow();
        addObject(arrow7, 153, 308);
        arrow7.setLocation(159, 312);
        arrow7.setRotation(180);
        Arrow arrow8 = new Arrow();
        addObject(arrow8, 171, 471);
        arrow8.setLocation(164, 464);
        Launcher launcher9 = new Launcher();
        addObject(launcher9, 173, 472);
        launcher9.setLocation(165, 465);
        Launcher launcher10 = new Launcher();
        addObject(launcher10, 173, 140);
        launcher10.setLocation(165, 135);
        Arrow arrow9 = new Arrow();
        addObject(arrow9, 174, 141);
        arrow9.setLocation(174, 136);
        launcher9.setLocation(165, 480);
        launcher9.setLocation(166, 482);
        arrow8.setLocation(168, 466);
        arrow8.setLocation(168, 464);
        launcher9.setLocation(165, 465);
        Spikes spikes = new Spikes(1);
        addObject(spikes, 848, 431);
        Spikes spikes2 = new Spikes(1);
        addObject(spikes2, 726, 337);
        spikes2.setRotation(180);
        spikes2.setLocation(755, 330);
        spikes2.setLocation(756, 331);
        Spikes spikes3 = new Spikes(1);
        addObject(spikes3, 871, 184);
        spikes3.setLocation(843, 186);
        spikes2.setLocation(755, 331);
        spikes.setLocation(848, 450);
        spikes2.setLocation(754, 317);
        spikes2.setLocation(758, 309);
        spikes2.setLocation(758, 315);
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
    }
    
    //adds the obstacles
    public void prepareObstacles()
    {
        
    }
}

