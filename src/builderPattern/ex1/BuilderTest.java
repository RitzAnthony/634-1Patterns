package builderPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: builderPattern.ex1
 * Date: 4/26/2018
 */
public class BuilderTest {
    public static void main(String[] args) {
        CarBuilder pickupBuilder = new PickupBuilder();
        Car pickup = pickupBuilder.setName()
                                    .setBrake()
                                    .setTire()
                                    .setLight()
                                    .build();
        System.out.println(pickup);

        StringBuilder stringBuilder = new StringBuilder("");
        String result = stringBuilder.append("Hello").append(" ").append("World").toString();
        System.out.println(result);
    }
}
