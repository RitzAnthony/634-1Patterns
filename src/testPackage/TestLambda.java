package testPackage;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: testPackage
 * Date: 3/2/2018
 */
public class TestLambda {
    int number;

    public TestLambda(int number) {
        this.number = number;
    }


    public static void main (String [] args) {
        TestLambda numbers [] = {
                new TestLambda(3),
                new TestLambda(1),
                new TestLambda(2)};

        Arrays.sort(numbers, (x, y) -> x.number < y.number? -1 : 1);

        for (TestLambda numb :
                numbers) {
            System.out.print(numb.number + " ");
        }
    }
}
