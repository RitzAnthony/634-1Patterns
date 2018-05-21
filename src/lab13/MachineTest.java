package lab13;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab13
 * Date: 5/21/2018
 */
public class MachineTest {
    public static void main(String[] args) {
        MachineGroup group = new MachineGroup();
        RevolutionaryCapsuleMaschine machine1 = new  RevolutionaryCapsuleMaschine();
        machine1.createOneCapsule();
        machine1.addOwner("Hans");
        machine1.addOwner("Peter");
        group.addMachine(machine1);

        RevolutionaryCapsuleMaschine machine2 = new  RevolutionaryCapsuleMaschine();
        machine2.createOneCapsule();
        machine2.addOwner("Tom");
        machine2.addOwner("Cherry");
        group.addMachine(machine2);

        for (String owner: group.getOwners()) {
            System.out.println(owner);
        }
    }
}
