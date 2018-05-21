package lab14;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab14
 * Date: 5/21/2018
 */
public class GreekSalad {
    private Lettuce lettuce;
    private Cucumber cucumber;
    private Tomato tomato;
    private FetaCheese fetaCheese = new FetaCheese();

    public Lettuce getLettuce() {
        return lettuce;
    }

    public void setLettuce(Lettuce lettuce) {
        this.lettuce = lettuce;
    }

    public Cucumber getCucumber() {
        return cucumber;
    }

    public void setCucumber(Cucumber cucumber) {
        this.cucumber = cucumber;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public void setTomato(Tomato tomato) {
        this.tomato = tomato;
    }

    public FetaCheese getFetaCheese() {
        return fetaCheese;
    }

    public void setFetaCheese(FetaCheese fetaCheese) {
        this.fetaCheese = fetaCheese;
    }

    @Override
    public String toString() {
        return "GreekSalad{" +
                "salad=" + lettuce.getName() +
                ", cucumber=" + cucumber.getName() +
                ", tomato=" + tomato.getName() +
                ", fetaCheese=" + fetaCheese.name +
                '}';
    }
}
