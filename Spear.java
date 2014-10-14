/**
 * Write a description of class Spear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spear extends Obstacle {
    public Spear() {
        turn(90);
    }

    /**
     * Act - do whatever the Spear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        slider();
        hitCharacter();
    }
}
