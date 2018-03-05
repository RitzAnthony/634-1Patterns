    package observerPattern.ex2;

    import java.util.ArrayList;
    import java.util.Calendar;
    import java.util.Timer;
    import java.util.TimerTask;
    public class MyTimer implements ClockTimer, MyObservableSubject{
        private Calendar cal;
        private Timer timer;
        private ArrayList<MyObserver> observers;
        /**
         * Constructor
         */
        public MyTimer() {
            cal = Calendar.getInstance();
            timer = new Timer();
            timer.schedule(new TimerAction(), 0, 1*1000);
            observers = new ArrayList<MyObserver>();
        }

        @Override
        public void addObserver(MyObserver observer) {
            observers.add(observer);
        }

        class TimerAction extends TimerTask {

            @Override
            public void run() {
                cal = Calendar.getInstance();
                tick();
            }
        }

        @Override
        public int getHour() {
            return cal.get(Calendar.HOUR_OF_DAY);
        }

        @Override
        public int getMinute() {
            return cal.get(Calendar.MINUTE);
        }

        @Override
        public int getSecond() {
            return cal.get(Calendar.SECOND);
        }

        // Gets called by the internal timer every second to provide an accurate time base.
        @Override
        public void tick() {
            for (MyObserver observer: observers) {
                observer.update();
            }
        }
    }