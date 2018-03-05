package strategyPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: strategyPattern.ex2
 * Date: 3/2/2018
 */
public class BubbleSort implements Sortable {

    @Override
    public void sort(int[] vector) {
        int temp;
        int nbrePermutation = -1;
        int nbreIteration   = 0;

        while (nbrePermutation != 0) {
            nbrePermutation = 0;

            for (int i=0; i<vector.length - nbreIteration - 1; i++) {

                if (vector[i] > vector[i + 1]) {
                    nbrePermutation++;
                    temp = vector[i + 1];
                    vector[i+1] = vector[i];
                    vector[i]   = temp;
                }
            }
        }
    }
}
