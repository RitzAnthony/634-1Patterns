package builderPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: builderPattern.ex1
 * Date: 4/26/2018
 */
public class PickupBuilder extends CarBuilder {
    @Override
    public CarBuilder setName() {
        this.name = "Pickup";
        return this;
    }

    @Override
    public CarBuilder setBrake() {
        this.brake = new Brake("Disc brake");
        return this;
    }

    @Override
    public CarBuilder setTire() {
        this.tire = new Tire("Offroad tire");
        return this;
    }

    @Override
    public CarBuilder setLight() {
        this.light = new Light("Xenon light");
        return this;
    }
}
