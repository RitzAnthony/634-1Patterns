package observerPattern.ex2;


public class DigitalTimer implements MyObserver {
    private MyTimer clockTimer;

    public DigitalTimer(MyTimer clockTimer) {
        this.clockTimer = clockTimer;
        clockTimer.addObserver(this);
    }

    @Override
    public void update() {
        System.out.print("Digital: ");
        System.out.printf("%02d", clockTimer.getHour());
        System.out.print(":");
        System.out.printf("%02d", clockTimer.getMinute());
        System.out.print(":");
        System.out.printf("%02d\n", clockTimer.getSecond());
    }
}
