package adapterPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: adapterPattern
 * Date: 3/25/2018
 */
public class AdapterTest {
    public static void main(String[] args) {
        Integer [] numbers = {  new Integer(1),
                                new Integer(2),
                                new Integer(3),
                                new Integer(4)};

        System.out.println("------ Queue test: ");
        ConcreteQueue<Integer> queue = new ConcreteQueue<>();
        for (Integer number : numbers) {
            queue.enQueue(number);
        }
        queue.deQueue();
        queue.printElements();

        System.out.println("------ Stack test: ");
        ConcreteStack<Integer> stack = new ConcreteStack<>();
        for (Integer number : numbers) {
            stack.push(number);
        }
        stack.pop();
        stack.printElements();
    }
}
