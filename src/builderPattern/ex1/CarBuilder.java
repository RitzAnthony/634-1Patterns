package builderPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: builderPattern.ex1
 * Date: 4/26/2018
 */
public abstract class CarBuilder {
    protected String name;
    protected Brake brake;
    protected Tire tire;
    protected Light light;

    public abstract CarBuilder setName ();

    public abstract CarBuilder setBrake();

    public abstract CarBuilder setTire();

    public abstract CarBuilder setLight();

    public Car build() {
        return new Car(name, brake, tire, light);
    }
}
