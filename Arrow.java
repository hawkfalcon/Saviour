/**
 * Write a description of class Arrow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrow extends Obstacle {

    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        repeater();
        hitCharacter();
    }
}
