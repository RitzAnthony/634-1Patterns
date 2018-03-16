package strategyPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: strategyPattern.abstractFactory.ex2
 * Date: 3/2/2018
 */
public class InsertionSort implements Sortable {

    @Override
    public void sort(int[] vector) {
        int temp;

        for (int i=1; i<vector.length; i++) {

            temp = vector[i];

            for (int j=i-1; j>=0; j--) {
                if (vector[j] > temp) {
                    vector[j+1] = vector[j];
                    vector[j]   = temp;
                } else {
                    vector[j+1] = temp;
                    break;
                }
            }
        }
    }
}
