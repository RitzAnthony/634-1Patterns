package lab13;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab13
 * Date: 5/21/2018
 */
public class MachineAdapter implements CapsuleMachine {
    private OldCapsuleMaschine machine;

    public MachineAdapter(OldCapsuleMaschine machine) {
        this.machine = machine;
    }

    @Override
    public int getNumberOfCapsules() {
        return machine.getNumberOfCapsules();
    }

    @Override
    public boolean isCompletelyUp() {
        return machine.isCompletelyUp();
    }

    @Override
    public String[] getOwners() {
        String[] result = {"Oldowner"};
        return result;
    }
}
