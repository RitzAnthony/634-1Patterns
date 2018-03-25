package abstractFactory.prototypePattern;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.prototypePattern
 * Date: 3/22/2018
 */
public class CloningTest {
    public static void main(String[] args) {
        //Create a car with a brake
        Brake discBrake = new Brake("Disc brake", 30);
        Car car1 = new Car(discBrake, 34000);

        //clone the car (deep copying)
        Car car2 = (Car) car1.clone();

        System.out.println(car1);
        System.out.println(car2);

        //check that the objects haven't the same memory addresses)
        System.out.println("car1 and car2 are in the same Memory address: " + (car1 == car2));
        System.out.println("brake1 and brake2 are in the same Memory address: " +
                (car1.getBrake() == car2.getBrake()));

    }
}
