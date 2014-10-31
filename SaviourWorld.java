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
    }
    
    public void reset() {
        currentLevel = 1;
    }
    
    //to do implement
    public World getNextLevel() {
        switch (currentLevel) {
           case 1: return new Dungeon1();
           case 2: return new Dungeon2();
           case 3: return new Dungeon3();
           case 4: return new Kitchen1();
           case 5: return new Kitchen2();
           case 6: return new Kitchen3();
           case 7: return new SaviourWinScreen();
           default: return new SaviourIntroScreen();
        } 
    }
}
