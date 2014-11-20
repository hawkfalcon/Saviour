/**
 * Write a description of class GlobalTimer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GlobalTimer  
{
    private static GlobalTimer instance = null;
    private int globaltime = 0;
    public static GlobalTimer getInstance() {
        if (instance == null) {
            instance = new GlobalTimer();
        }
        return instance;
    }
    
    private GlobalTimer() {
    }
    
    public int getTimer(){
        return globaltime;
    }
    
    public void addTime(int globaltime){
        this.globaltime += globaltime;
    }
    
}
