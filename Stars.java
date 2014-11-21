/**
 * Write a description of class Stars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stars  
{
    private static Stars instance = null;
    private int totalleveltime = 0;
    public static Stars getInstance() {
        if (instance == null) {
            instance = new Stars();
        }
        return instance;
    }
    
    private Stars() {
    }
    
    public void snatchTime(int leveltime){
        totalleveltime += leveltime;
    }
    
    public int getLevelTime(){
        return totalleveltime;
    }
    
    public void timerReset(){
        totalleveltime = 0;
    }
    
    public int earnedStars(){
        if (totalleveltime < 180 ){
            return 3;
        }
        else if (360 >= totalleveltime && totalleveltime >= 180){
            return 2;
        }
        else {
            return 1;
        }
    }
}
