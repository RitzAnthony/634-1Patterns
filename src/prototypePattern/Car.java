package prototypePattern;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: prototypePattern
 * Date: 3/22/2018
 */
public class Car implements Cloneable {
    private Brake brake;
    private int price;

    public Car(Brake brake, int price) {
        this.brake = brake;
        this.price = price;
    }

    public Brake getBrake() {
        return brake;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public Object clone() {
        Car resultCar = null;
        try {
            resultCar = (Car) super.clone();
            resultCar.brake = (Brake) this.brake.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resultCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brake=" + brake +
                ", price=" + price +
                '}';
    }
}
