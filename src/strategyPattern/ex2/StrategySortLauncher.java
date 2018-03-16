package strategyPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: strategyPattern.abstractFactory.ex2
 * Date: 3/1/2018
 */
public class StrategySortLauncher {

    public static void main(String[] args) {
        StrategySortLauncher launcher = new StrategySortLauncher();
        launcher.test();
    }

    public void test() {
        int[] tab1 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;
        int[] tab2 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;
        int[] tab3 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;

        Sorter sorter = new Sorter(new BubbleSort());

        System.out.println("test bubble sort");
        sorter.sort(tab1);
        sorter.showVectorData(tab1);

        System.out.println("test insert sort");
        sorter.setSortable(new InsertionSort());
        sorter.sort(tab2);
        sorter.showVectorData(tab2);

        System.out.println("test selection sort");
        sorter.setSortable(new SelectionSort());
        sorter.sort(tab3);
        sorter.showVectorData(tab3);
    }
}
