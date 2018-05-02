package proxyPattern.example;

public class RealNavigation implements Navigation {
    @Override
    public void navigate(User user, String url) {
        System.out.println("Display URL");
    }
}
