import greenfoot.*;

/**
 * Write a description of class Obstacle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Obstacle extends Actor {
    int x, y;

    public void addedToWorld(World world) {
        x = getX();
        y = getY();
    }

    public void hitCharacter() {
        Actor c;
        c = getOneIntersectingObject(Character.class);
        if (c != null) {
            getWorld().removeObject(c);
            SaviourWorld sw = new SaviourWorld();
            getWorld().addObject(new Fade(sw.getNextLevel(), true), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        }
    }

    public void repeater() {
        move(2);
        if (!getIntersectingObjects(Wall.class).isEmpty()) {
            super.setLocation(x, y);
        }
    }

    public void initSlider(int slider, int x, int y, int speeder) {
        moveX = x;
        moveY = y;
        initialSlide = slider;
        slide = slider;
        initialSpeed = speeder;
        speed = speeder;
    }

    int initialSlide = 45;
    int initialSpeed = 2;
    int speed = 2;
    int slide = 45;
    int moveX = 0;
    int moveY = 1;

    public void slider() {
        if (speed == 0) {
            if (slide > 0) {
                setLocation(getX() + moveX, getY() + moveY);
                speed = initialSpeed;
                slide--;
            } else {
                slide = initialSlide;
                moveY = -moveY;
                moveX = -moveX;
            }
        } else {
            speed--;
        }
    }
}
