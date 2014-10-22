import greenfoot.*;

/**
 * Basic level manager to get new levels
 */
public class SaviourWorld { 
   private static SaviourWorld instance = null;

   public static SaviourWorld getInstance() {
      if(instance == null) {
         instance = new SaviourWorld();
      }
      return instance;
   }
   
    int currentLevel = 1;
    
    public void levelup() {
        currentLevel++;
        if (currentLevel > 3) {
            reset();
        }
    }
    
    public void reset() {
        currentLevel = 0;
    }
    
    //todo implement
    public World getNextLevel() {
        switch (currentLevel) {
           case 1: return new Dungeon1();
           case 2: return new Dungeon3();
           //case 3: return new Dungeon3();
           default: return new SaviourIntroScreen();
        } 
    }
}
