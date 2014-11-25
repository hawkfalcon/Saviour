import greenfoot.*;

/**
 * Write a description of class Boss here.
 * <p/>
 * Dane created obstacles + layout
 * Leighton edited layout + obstacles
 */
public class Boss extends SaviourLevel {       
    public boolean dead = false;
    
    /**
     * Constructor for objects of class Boss.
     */
    public Boss() {
        super(450, 450, 450, 100, LevelType.KITCHEN);
        prepare();
    }

    public void act(){
        deadKing();
        isKingDead();
    }

    public void prepare() {
        Actor king = new King();
        addObject(king, 450, 220);
        prepareWalls();
        prepareObstacles();
    }

    public void prepareWalls() {
        //Middle Left Vertical Wall
        for (int i = 1; i < 7; i++) {
            addObject(new Wall(), getWidth() / 3 + halfWall, getPos(i));
        }
        //Middle Right Vertical Wall
        for (int i = 1; i < 7; i++) {
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
        //Left Vertical Wall
        //for (int i = 8; i < 15; i++){
        //    addObject(new Wall(), (getWidth()/30) * 5  + halfWall, getPos(i));
        //}
        //Right Vertical Wall
        //for (int i = 8; i < 15; i++){
        //    addObject(new Wall(), (getWidth()/15)* 12 + halfWall, getPos(i));
        //}
    }

    public void prepareObstacles() {
        //adds acid
        addObstacle(new Acid(), 781, 130);
        addObstacle(new Acid(), 141, 130);
        //add spears
        addObstacle(new Spear(), 315, 195, false, 90);
        addObstacle(new Spear(), 615, 195, false, 90);
        //adds arrows
        addObstacle(new Arrow(), 45, 465, true);
        addObstacle(new Arrow(), 855, 465, true, 180);
        addObstacle(new Arrow(), 730, 225, true, 135);
        addObstacle(new Arrow(), 170, 225, true, 45);
        addObstacle(new Arrow(), 170, 370, true);
        addObstacle(new Arrow(), 730, 370, true, 180);
    }

    public void deadKing(){
        if (getObjects(King.class).isEmpty()){
            dead = true;
        }
    }
    
    public void isKingDead(){
        if (dead == true){
         //King dies and you get the key to save your lover
         addObject(new Key1(), 562, 107);
         dead = false;
        }
    }
    
    public boolean checkKing(){
        return dead;
    }
}