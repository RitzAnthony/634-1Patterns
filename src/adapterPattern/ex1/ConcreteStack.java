package adapterPattern.ex1;

import java.util.LinkedList;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: adapterPattern
 * Date: 3/25/2018
 */
public class ConcreteStack <E> implements MyStack<E> {
    private LinkedList<E> linkedList = new LinkedList<>();

    @Override
    public void push(E element) {
        linkedList.add(element);
    }

    @Override
    public E pop() {
        return linkedList.removeLast();
    }

    public void printElements() {
        linkedList.forEach(System.out::println);
    }
}
