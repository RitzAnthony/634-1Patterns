package statePattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: statePattern
 * Date: 4/13/2018
 */
public class SpeakingState extends MeetingState {
    public SpeakingState(Context context) {
        super(context);
    }

    @Override
    public void register() {
       context.setState(context.getRegisterState());
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
