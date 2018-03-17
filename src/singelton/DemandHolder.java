package singelton;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: singelton
 * Date: 3/17/2018
 */
public class DemandHolder {

    private DemandHolder() {
        System.out.println("Inside DemandHolder");
    }

    public static DemandHolder getInstance ()
    {
        System.out.println("Inside DemandHolder getInstance");
       return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder{
        private static final DemandHolder INSTANCE = new DemandHolder();
    }
}
