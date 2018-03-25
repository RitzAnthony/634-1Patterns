package commandPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: commandPattern.ex2
 * Date: 3/25/2018
 */
public class SpeedOffControl implements ICommand {
    private SpeedControl speedControl;

    public SpeedOffControl(SpeedControl speedControl) {
        this.speedControl = speedControl;
    }

    @Override
    public void execute() {
        speedControl.off();
    }
}
