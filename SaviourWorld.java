import greenfoot.*;
/**
 * Write a description of class SaviourWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SaviourWorld {
    
    public SaviourWorld() {
    }
        
    public World getNextLevel() {
        return new Dungeon1();
    }
}
