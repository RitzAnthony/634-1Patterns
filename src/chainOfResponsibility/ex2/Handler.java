package chainOfResponsibility.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: chainOfResponsibility.ex2
 * Date: 4/14/2018
 */
public abstract class Handler {
    protected Handler successor;

    public abstract void handleRequest(Email email);

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
