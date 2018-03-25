package commandPattern.ex2;


import java.util.LinkedList;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: commandPattern.ex2
 * Date: 3/25/2018
 */
public class CarControl {
    private BrakeOnCommand brakeOnCommand;
    private BrakeOffCommand brakeOffCommand;
    private SpeedOnCommand speedOnCommand;
    private SpeedOffControl speedOffControl;
    private LinkedList<ICommand> blackBox = new LinkedList<>();

    public CarControl() {
        Brakes brakes = new Brakes();
        this.brakeOnCommand = new BrakeOnCommand(brakes);
        this.brakeOffCommand = new BrakeOffCommand(brakes);

        SpeedControl speedControl = new SpeedControl();
        this.speedOnCommand = new SpeedOnCommand(speedControl);
        this.speedOffControl = new SpeedOffControl(speedControl);
    }

    public void pullBrake() {
        brakeOnCommand.execute();
        blackBox.add(brakeOnCommand);
    }

    public void releaseBrake() {
        brakeOffCommand.execute();
        blackBox.add(brakeOffCommand);
    }

    public void enableSpeedControl() {
        speedOnCommand.execute();
        blackBox.add(speedOnCommand);
    }

    public void disableSpeedControl() {
        speedOffControl.execute();
        blackBox.add(speedOffControl);
    }

    public void showBlackbox() {
        blackBox.forEach(ICommand::execute);
    }


}
