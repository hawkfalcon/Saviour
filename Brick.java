/**
 * Brick
 */
public class Brick extends Obstacle {

    //@author Leighton
    //Takes a speed int (new Brick(2);)
    public Brick(int speed) {
        //int incrementX, int incrementY, int speed, int distance
        initSlider(0, speed, 1, 100 / speed);
    }

    public void act() {
        slider();
        killer();
    }
}
