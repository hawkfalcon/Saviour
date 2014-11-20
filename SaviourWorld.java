import greenfoot.*;

/**
 * Basic level manager to get new levels
 */
public class SaviourWorld {
    private static SaviourWorld instance = null;
    public boolean haungsmode = false;

    public static SaviourWorld getInstance() {
        if (instance == null) {
            instance = new SaviourWorld();
        }
        return instance;
    }
    
    private SaviourWorld() {
    }

    int currentLevel = 1;

    public void levelup() {
        currentLevel++;
    }

    public void reset() {
        currentLevel = 1;
    }
    
    public int getLevel() {
        return currentLevel;
    }

    public World getNextLevel() {
        switch (currentLevel) {
            case 1:
                return new Dungeon1();
            case 2:
                return new Dungeon2();
            case 3:
                return new Dungeon3();
            case 4:
                return new Kitchen1();
            case 5:
                return new Kitchen2();
            case 6:
                return new Kitchen3();
            case 7:
                return new Bedroom1();
            case 8:
                return new Bedroom2();
            case 9:
                return new Bedroom3();
            case 10:
                return new Boss();
            case 11:
                return new SaviourWinScreen();
            default:
                return new SaviourIntroScreen();
        }
    }

    public void setHaungsMode(boolean haungsmode) {
        this.haungsmode = haungsmode;
    }

    public boolean haungsMode() {
        return haungsmode;
    }
}
