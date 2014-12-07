import greenfoot.*;

public class Blood extends Actor {

    public void addedToWorld(World world) {
        for (int i = 1; i < 7; i++) {
            Greenfoot.delay(5);
            setImage("blood" + i + ".png");
        }
        world.removeObject(this);
    }
}
