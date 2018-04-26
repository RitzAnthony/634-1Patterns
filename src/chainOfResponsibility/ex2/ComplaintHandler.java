package chainOfResponsibility.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: chainOfResponsibility.ex2
 * Date: 4/14/2018
 */
public class ComplaintHandler extends Handler {
    @Override
    public void handleRequest(Email email) {
        if (email.text.toUpperCase().contains("COMPLAINT")) {
            System.out.println("Complaint: " + email.text);
        }
        else {
            if (successor !=null) successor.handleRequest(email);
        }
    }
}
