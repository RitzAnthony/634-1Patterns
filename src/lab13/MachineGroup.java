package lab13;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Stream;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab13
 * Date: 5/21/2018
 */
public class MachineGroup implements MachineComponent {
    private LinkedList<MachineComponent> group = new LinkedList<>();
    @Override
    public void addMachine(MachineComponent machine) {
        group.add(machine);
    }

    @Override
    public int getNumberOfCapsules() {
        int result = 0;
        for (MachineComponent machine : group) {
            result+= machine.getNumberOfCapsules();
        }
        return result;
    }

    @Override
    public boolean isCompletelyUp() {
        for (MachineComponent machine: group) {
            if (!machine.isCompletelyUp()) return false;
        }
        return true;
    }

    @Override
    public String[] getOwners() {
        LinkedList<String> result = new LinkedList<>();
        for (MachineComponent machine: group) {
            result.addAll(Arrays.asList(machine.getOwners()));
        }
        return result.toArray(new String[result.size()]);
    }
}
