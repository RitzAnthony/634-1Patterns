package statePattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: statePattern
 * Date: 4/13/2018
 */
public class WaitingToSpeakState extends MeetingState {
    public WaitingToSpeakState(Context context) {
        super(context);
    }

    @Override
    public void register() {
        context.setState(context.getRegisterState());
    }

    @Override
    public void inMeeting() {

    }

    @Override
    public void speaking() {
        context.setState(context.getSpeakingState());
    }

    @Override
    public void waitingToSpeak() {

    }
}
