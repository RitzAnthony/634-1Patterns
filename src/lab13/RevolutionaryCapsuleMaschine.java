package lab13;

import java.util.ArrayList;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab13
 * Date: 5/21/2018
 */
public class RevolutionaryCapsuleMaschine implements MachineComponent {
    private int numberOfCapsules = 0;
    private boolean isUp = true;
    private ArrayList<String> owners = new ArrayList<>();

    public void addOwner(String owner) {
        owners.add(owner);
    }

    public void createOneCapsule() {
        numberOfCapsules++;
    }

    @Override
    public int getNumberOfCapsules() {
        return numberOfCapsules;
    }

    @Override
    public boolean isCompletelyUp() {
        return isUp;
    }

    @Override
    public String[] getOwners() {
        return owners.toArray(new String[owners.size()]);
    }

    @Override
    public void addMachine(MachineComponent machine) {
        //Do nothing
    }
}
