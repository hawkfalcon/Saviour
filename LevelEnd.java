import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelEnd extends SaviourLevel
{

    /**
     * Constructor for objects of class LevelEnd.
     * 
     */
    public LevelEnd()
    {
        super(90,326,770,326);
        prepare();
    }
    public void prepare()
    {
        prepareWalls();
    }
    public void prepareWalls()
    {
        for (int i = 1; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4)* 3 - halfWall);
        }
        for (int i = 1; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight() / 4) * 3/2 - halfWall);
        }
        for (int i = 1; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight()-30) - halfWall);
        }
        for (int i = 1; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight() -60) - halfWall);
        }
        for (int i = 1; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight() - 90) - halfWall);
        }
        for (int i = 1; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight() - 120) - halfWall);
        }
        for (int i = 1; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight() - 400 - halfWall));
        }
        for (int i = 1; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight() - 430) - halfWall);
        }
        for (int i = 1; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight() - 460) - halfWall);
        }
        for (int i = 1; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight() -490) - halfWall);
        }
        for (int i = 1; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight() -520) - halfWall);
        }
        for (int i = 1; i < 30; i++) {
            addObject(new Wall(), getPos(i), (getHeight() -550) - halfWall);
        }
        showText("Your score is: ", getWidth()/2, getHeight()/5);
    }
}
