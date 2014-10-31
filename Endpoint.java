import greenfoot.*;

/**
 * The goal to get to at the end of the level
 */
public class Endpoint extends Actor {
    public boolean holdingkey = false;
    
    /**
     * Act - do whatever the Endpoint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        characterHitsEndpoint();
    }

    public void characterHitsEndpoint() {
        if (holdingkey == true){
            Actor c = getOneIntersectingObject(Character.class);
            if (c != null) {
                getWorld().removeObject(c);
                SaviourWorld sw = SaviourWorld.getInstance();
                sw.levelup();
                getWorld().addObject(new Fade(sw.getNextLevel(), true), getWorld().getWidth() / 2, getWorld().getHeight() / 2);            
            }
        }
        if (holdingkey == false){
            //do nothing
        }
    }
    
    public void carryKey()
    {
        if ( Key1.class != null )
        {
            holdingkey = false;
        }
        if ( Key1.class == null )
        {
            holdingkey = true;
        }
    }
    
    public boolean haveKey()
    {
        return holdingkey;
    }
}
