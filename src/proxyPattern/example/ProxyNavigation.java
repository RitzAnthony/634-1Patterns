package proxyPattern.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProxyNavigation implements Navigation {
    private RealNavigation realNavigation;
    private List<String> listOfRestrictedURL = new ArrayList<>(Arrays.asList("intranet.hevs.ch", "technopol.ch"));
    @Override
    public void navigate(User user, String url) {
        if(controlURL(url) || user.isAdmin()){
            this.realNavigation = new RealNavigation();
            this.realNavigation.navigate(user, url);
        }
        else {
            System.out.println("You are not allowed to see this link");
        }
    }

    private boolean controlURL (String url){
        return ! listOfRestrictedURL.contains(url);
    }
}
