package strategyPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: strategyPattern.abstractFactory.ex2
 * Date: 3/1/2018
 */
public interface Sortable {

    void sort (int [] numbers);

    default void showVectorData(int[] vector) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<vector.length; i++) {
            sb.append(vector[i] + "\t");
        }
        System.out.println(sb.toString());
    }
}
