package chainOfResponsibility.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: chainOfResponsibility.ex1
 * Date: 4/14/2018
 */
public abstract class Superior {
    protected Superior superior;
    protected int maxDaysDecision;

    public Superior(int maxDaysDecision) {
        this.maxDaysDecision = maxDaysDecision;
    }

    public void setSuperior(Superior superior) {
        this.superior = superior;
    }

    public void handleRequest(MilitaryRequest request){
        if(request.vacationDays < maxDaysDecision) {
            System.out.println("Requesthandler for request " +
                    request.vacationDays + " days : " + this);
        }
        else {
            if (superior != null) superior.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
