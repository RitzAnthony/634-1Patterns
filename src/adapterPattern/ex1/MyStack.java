package adapterPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: adapterPattern
 * Date: 3/25/2018
 */
public interface MyStack <E> {
    void push(E element);
    E pop();
}
