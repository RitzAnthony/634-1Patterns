package statePattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: statePattern
 * Date: 4/13/2018
 */
public class Context {
    private MeetingState registerState = new RegisterState(this);
    private MeetingState inMeetingState = new InMeetingState(this);
    private MeetingState speakingState = new SpeakingState(this);
    private MeetingState waitingState = new WaitingToSpeakState(this);

    private MeetingState state = registerState;

    public void leave() {
        System.out.println("Leave");
        state.register();
    }

    public void enter() {
        System.out.println("enter");
        state.inMeeting();
    }

    public void over() {
        System.out.println("over");
        state.inMeeting();
    }

    public void ask() {
        System.out.println("ask");
        state.waitingToSpeak();
    }

    public void handOver() {
        System.out.println("handover");
        state.speaking();
    }

    //setter
    public void setState(MeetingState state) {
        System.out.println(state.getClass().getSimpleName());
        this.state = state;
    }

    //getter
    public MeetingState getRegisterState() {
        return registerState;
    }

    public MeetingState getInMeetingState() {
        return inMeetingState;
    }

    public MeetingState getSpeakingState() {
        return speakingState;
    }

    public MeetingState getWaitingState() {
        return waitingState;
    }
}
