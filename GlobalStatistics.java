public class GlobalStatistics {

    private static GlobalStatistics instance = null;
    private int globaltimer = 0;
    private int globalstars = 0;

    public static GlobalStatistics getInstance() {
        if (instance == null) {
            instance = new GlobalStatistics();
        }
        return instance;
    }

    private GlobalStatistics() {
    }

    public int getTimer() {
        return globaltimer;
    }

    public void addTime(int globaltime) {
        globaltimer += globaltime;
    }

    public int getStars() {
        return globalstars;
    }

    public void addStars(int starcount) {
        globalstars += starcount;
    }

}