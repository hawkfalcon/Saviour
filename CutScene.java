import greenfoot.*; 

public class CutScene extends World {

    public CutScene(int number) {    
        super(900, 600, 1);
        //setBackground("cutscene" + number + ".jpg");
        showText(number + "", getWidth()/2, getHeight()/2); 
    }
    
    //restart game on click
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            SaviourWorld sw = SaviourWorld.getInstance();
            System.out.println(sw.getLevel());
            Greenfoot.setWorld(sw.getNextLevel());
        }
    }

}
