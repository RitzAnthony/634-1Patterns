package chainOfResponsibility.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: chainOfResponsibility.ex2
 * Date: 4/14/2018
 */
public class HandlerTest {
    public static void main(String[] args) {
        SpamHandler spamHandler = new SpamHandler();
        FanHandler fanHandler = new FanHandler();
        ComplaintHandler complaintHandler = new ComplaintHandler();

        //concatenation of handlers
        Handler handlerChain = spamHandler;
        spamHandler.successor = fanHandler;
        fanHandler.successor = complaintHandler;

        Email email1 = new Email("Here some spam");
        Email email2 = new Email("This is for the chief");
        Email email3 = new Email("Here is my complaint");

        handlerChain.handleRequest(email1);
        handlerChain.handleRequest(email2);
        handlerChain.handleRequest(email3);
    }
}
