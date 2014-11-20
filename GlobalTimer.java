/**
 * Write a description of class GlobalTimer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GlobalTimer  
{
    private static GlobalTimer instance = null;
    private int globaltimer = 0;
    public static GlobalTimer getInstance() {
        if (instance == null) {
            instance = new GlobalTimer();
        }
        return instance;
    }
    
    private GlobalTimer() {
    }
    
    public int getTimer(){
        return globaltimer;
    }
    
    public void addTime(int globaltime){
        globaltimer += globaltime;
    }
    
}
