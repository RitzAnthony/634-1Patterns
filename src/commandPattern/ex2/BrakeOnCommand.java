package commandPattern.ex2;


/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: commandPattern.ex2
 * Date: 3/25/2018
 */
public class BrakeOnCommand implements ICommand {
    private Brakes brake;

    public BrakeOnCommand(Brakes brake) {
        this.brake = brake;
    }

    @Override
    public void execute() {
        brake.pull();
    }
}
