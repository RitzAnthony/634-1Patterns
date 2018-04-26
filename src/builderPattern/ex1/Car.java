package builderPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: builderPattern.ex1
 * Date: 4/26/2018
 */
public class Car {
    private String name;
    private Brake brake;
    private Tire tire;
    private Light light;

    public Car(String name, Brake brake, Tire tire, Light light) {
        this.name = name;
        this.brake = brake;
        this.tire = tire;
        this.light = light;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brake getBrake() {
        return brake;
    }

    public void setBrake(Brake brake) {
        this.brake = brake;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brake=" + brake.getName() +
                ", tire=" + tire.getName() +
                ", light=" + light.getName() +
                '}';
    }
}
