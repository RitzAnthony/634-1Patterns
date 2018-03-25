package adapterPattern.ex1;

import java.util.LinkedList;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: adapterPattern
 * Date: 3/25/2018
 */
public class ConcreteQueue <E> implements MyQueue<E> {
    private LinkedList<E> linkedList = new LinkedList<>();

    @Override
    public void enQueue(E element) {
        linkedList.add(element);
    }

    @Override
    public E deQueue() {
        return linkedList.removeFirst();
    }

    public void printElements() {
        linkedList.forEach(System.out::println);
    }
}
