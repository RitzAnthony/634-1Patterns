package singelton;

import java.util.ArrayList;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: singelton
 * Date: 3/17/2018
 */
public final class ObserveableOnboardSystem extends OnboardSystem implements Observeable{
    private ArrayList<Observer> observers = new ArrayList<>();
    private static ObserveableOnboardSystem instance;

    private ObserveableOnboardSystem () {
        super();
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public static ObserveableOnboardSystem getInstance (){
        if (instance == null) {
            synchronized (ObserveableOnboardSystem.class){
                if (instance == null){
                    instance = new ObserveableOnboardSystem();
                }
            }
        }
        return instance;
    }

    @Override
    public void setTemperature(int temperature) {
        super.setTemperature(temperature);
        if (temperature > TEMPERATURELIMIT)
            notifyObservers("Temperature too high");

    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
        if (speed > SPEEDLIMIT)
            notifyObservers("Speed too high");
    }

    private void notifyObservers (String warning){
        observers.forEach(observer -> observer.update(warning));
    }
}
