import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class King here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class King extends Actor
{
    public int timer = 0;
    /**
     * Act - do whatever the King wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        detect();
        charge();
        kill();
        move(1);
        die();
    }    
    
    public void detect()
    {
        if (getObjectsInRange(900, Character.class) != null)
        {
            for (Object o : getObjectsInRange(900, Character.class))
            {
                Actor character = (Actor) o;
                turnTowards(character.getX(), character.getY());
            }
        }
    }
    
    public void charge()
    {
        timer++;
        if (timer >= 300)
        {
            move(3);
            if (timer == 325)
            {
                timer = 0;
            }
        }
    }
    
    public void kill()
    {
        if (SaviourWorld.getInstance().haungsMode() == false)
        {
            Actor c = getOneIntersectingObject(Character.class);
            if (c !=null)
            {
                getWorld().removeObject(c);
                SaviourWorld sw = SaviourWorld.getInstance();
                getWorld().addObject(new Fade(sw.getNextLevel(),true),getWorld().getWidth()/2,getWorld().getHeight()/2);
            }
        }
    }
    
    public void setLocation(int x, int y) {
        //save the old location before we move
        int oldX = getX();
        int oldY = getY();
        super.setLocation(x, y);
        //don't actually move if there is a solid object blocking us.
        if (!getIntersectingObjects(Solid.class).isEmpty()) {
            super.setLocation(oldX, oldY);
        }
    }
    
    public void die()
    {
        
    }
}
