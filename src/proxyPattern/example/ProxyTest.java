package proxyPattern.example;

public class ProxyTest {
    public static void main(String[] args) {
        User user = new User(false);
        String url = "google.ch";

        Navigation proxyNavigation = new ProxyNavigation();
        proxyNavigation.navigate(user, url);

    }
}
