import greenfoot.*; 

public class CutScene extends World {

    public CutScene(String image) {    
        super(900, 600, 1);
        setBackground(image + ".jpg");
    }
    
    //restart game on click
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            SaviourWorld sw = SaviourWorld.getInstance();
            Greenfoot.setWorld(sw.getNextLevel(false));
        }
    }

}
