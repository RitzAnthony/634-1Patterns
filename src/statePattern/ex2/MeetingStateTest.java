package statePattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: statePattern
 * Date: 4/13/2018
 */
public class MeetingStateTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.leave(); //this should not change the state
        context.enter();
        context.ask();
        context.handOver();
        context.over();
        context.enter(); //this should not change the state
        context.leave();
    }
}
