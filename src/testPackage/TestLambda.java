package testPackage;

import java.util.ArrayList;
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

    public int getNumber() {
        return number;
    }

    public TestLambda(int number) {
        this.number = number;
    }

    public int getMax (Maximum m){
        return m.egal(2,1);
    }

    @FunctionalInterface
    public interface Maximum {
        public int egal(int a, int b);
    }

    public static void main (String [] args) {
        TestLambda numbers [] = {
                new TestLambda(3),
                new TestLambda(1),
                new TestLambda(2)};

        String[] words = {"hello", "Anthony", "Ritz", "MAX", "tom"};
        Arrays.sort(words, (a, b) -> a.compareTo(b));

        Comparator comp = Comparator.comparing(TestLambda::getNumber);
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(words));

        Comparator<TestLambda> myFunction = (x, y) -> (x.number < y.number)? -1 : 1;

        Arrays.sort(numbers, comp);

        ArrayList<TestLambda> list = new ArrayList<TestLambda>(Arrays.asList(numbers));

        System.out.println("Hello");

        String text = "EGAL";

        TestLambda lambda = new TestLambda(4);
        System.out.println(lambda.getMax(Math::max));

        int numX = 3;


        for (TestLambda numb :numbers) {
            System.out.print(numb.number + " ");
        }
    }
}
