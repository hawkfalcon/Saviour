/**
 * Spikes
 */
public class Spikes extends Obstacle {

    //Takes a speed int (new Spikes(2);)
    public Spikes(int speed) {
        //int incrementX, int incrementY, int speed, int distance
        initSlider(1, 0, speed, 23);
    }

    public void act() {
        slider();
        killer();
    }
}