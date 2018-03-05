package strategyPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: strategyPattern.ex2
 * Date: 3/2/2018
 */
public class SelectionSort implements Sortable{

    @Override
    public void sort(int[] vector) {
        int temp, cursor = 0;

        for (int i=0; i<vector.length; i++) {
            temp   = vector[i];
            cursor = i;

            for (int j=i; j<vector.length; j++) {
                if (vector[j] < temp) {
                    temp   = vector[j];
                    cursor = j;
                }
            }
            vector[cursor] = vector[i];
            vector[i]      = temp;
        }
    }
}
