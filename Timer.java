import greenfoot.*;

import java.awt.*;

public class Timer extends Actor {

    private GreenfootImage board;
    private int time = 0;
    private int counter = 0;

    public Timer() {
        int boardWidth = 120;
        int boardHeight = 30;
        int boardTransparency = 225;

        board = new GreenfootImage(boardWidth, boardHeight);
        board.setColor(Color.gray);
        board.setTransparency(boardTransparency);
        board.fillRect(0, 0, boardWidth, boardHeight);
        this.setImage(board);

        update();
    }

    public void act() {
        gotTime();
        counter++;
    }

    private void update() {
        GreenfootImage timer = new GreenfootImage(board);
        timer.drawImage(new GreenfootImage("Time: " + time, 18, Color.WHITE, new Color(0, 0, 0, 0)), 25, 5);
        this.setImage(timer);
    }

    private void gotTime() {
        if (counter == 46) {
            time++;
            counter = 0;
            update();
        }
    }

    public int getTime() {
        return time;
    }
}