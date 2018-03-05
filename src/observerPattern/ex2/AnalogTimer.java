package observerPattern.ex2;

public class AnalogTimer implements MyObserver{
    private MyTimer clockTimer;

    public AnalogTimer(MyTimer clockTimer) {
        this.clockTimer = clockTimer;
        clockTimer.addObserver(this);
    }

    @Override
    public void update() {
        System.out.print("Analog: ");
        System.out.printf("%02d", clockTimer.getHour());
        System.out.print(":");
        System.out.printf("%02d", clockTimer.getMinute());
        System.out.print(":");
        System.out.printf("%02d\n", clockTimer.getSecond());

    }
}
