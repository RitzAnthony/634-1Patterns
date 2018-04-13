package statePattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: statePattern
 * Date: 4/13/2018
 */
public abstract class MeetingState {
    protected Context context;

    public MeetingState(Context context) {
        this.context = context;
    }

    public abstract void register();
    public abstract void inMeeting();
    public abstract void speaking();
    public abstract void waitingToSpeak();
}
