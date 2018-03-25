package commandPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: commandPattern.ex2
 * Date: 3/25/2018
 */
public class CommandTest {
    public static void main(String[] args) {
        CarControl carControl = new CarControl();

        carControl.enableSpeedControl();
        carControl.disableSpeedControl();
        carControl.pullBrake();
        carControl.releaseBrake();

        System.out.println("Show blackbox: ");
        carControl.showBlackbox();
    }
}
