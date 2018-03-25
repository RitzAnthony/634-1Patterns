package commandPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: commandPattern.ex2
 * Date: 3/25/2018
 */
public class BrakeOffCommand implements ICommand {
    private Brakes brakes;

    public BrakeOffCommand(Brakes brakes) {
        this.brakes = brakes;
    }

    @Override
    public void execute() {
        brakes.release();
    }
}
