import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Timer extends Actor {
    private GreenfootImage board;
    private GreenfootImage timer;
    private String label = "Time: ";
    long startTime = System.currentTimeMillis();
    private int duration = 0;

    public Timer() {
        int boardWidth = 120;
        int boardHeight = 30;
        int boardTransparency = 225;
        
        board = new GreenfootImage(boardWidth, boardHeight);
        board.setColor(Color.gray);
        board.setTransparency(boardTransparency);
        board.fillRect(0,0,boardWidth,boardHeight);
        this.setImage(board);
        
        update();
    }

    public void act() {
        duration = (int)(System.currentTimeMillis() - startTime) / 1000; 
        update();
    } 
    
    private void update() {
        timer = new GreenfootImage(board);
        timer.drawImage(new GreenfootImage(label + duration, 18, Color.WHITE, new Color(0,0,0,0)),25,5);
        this.setImage(timer);
    }
}
