package decoratorPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern.abstractFactory.ex2
 * Date: 3/9/2018
 */
public class JourneyTest {

    public static void main (String [] args) {
        Journey journey =
                new Wellnessservice(
                    new Wellnessservice(
                            new Hotelroom(
                                    new IranJourney())));

        System.out.println(journey.getDescription());
        System.out.println(journey.getPrice());


    }

}
