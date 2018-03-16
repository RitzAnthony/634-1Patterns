package strategyPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: strategyPattern.abstractFactory.ex2
 * Date: 3/1/2018
 */
public class Sorter implements Sortable {

    private Sortable sortable;

    public Sorter(Sortable sortable) {
        this.sortable = sortable;
    }

    public void setSortable(Sortable sortable) {
        this.sortable = sortable;
    }

    @Override
    public void sort(int[] numbers) {
        sortable.sort(numbers);
    }
}
