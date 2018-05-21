package lab13;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab13
 * Date: 5/21/2018
 */
public class OldCapsuleMaschine {
    private int numberOfCapsules = 0;

    public void createOneCapsule() {
        numberOfCapsules++;
    }

    public int getNumberOfCapsules() {
        return numberOfCapsules;
    }

    public boolean isCompletelyUp() {
        return false;
    }
}
