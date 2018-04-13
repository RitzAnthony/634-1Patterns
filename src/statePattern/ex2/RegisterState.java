package statePattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: statePattern
 * Date: 4/13/2018
 */
public class RegisterState extends MeetingState {

    public RegisterState(Context context) {
        super(context);
    }

    @Override
    public void register() {

    }

    @Override
    public void inMeeting() {
        context.setState(context.getInMeetingState());
    }

    @Override
    public void speaking() {

    }

    @Override
    public void waitingToSpeak() {

    }
}
