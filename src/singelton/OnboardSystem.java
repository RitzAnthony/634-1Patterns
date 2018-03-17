package singelton;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: singelton
 * Date: 3/17/2018
 */
public class OnboardSystem {
    private int temperature = 0;
    private int speed = 0;

    public final int TEMPERATURELIMIT = 120;
    public final int SPEEDLIMIT = 100;

    private static OnboardSystem instance;
    protected OnboardSystem() {
        System.out.println("inside the constructor");
    }

    public static OnboardSystem getInstance() {
        System.out.println("inside the getInstance method");
        if (instance == null) {
            synchronized (OnboardSystem.class) {
                if (instance == null){
                    instance = new OnboardSystem();
                }
            }
        }
        return instance;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
