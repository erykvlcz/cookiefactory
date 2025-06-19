package code.models;

import java.util.ArrayList;

public class Client {
    private String name;
    private ArrayList<Cookie> ownedCookies = new ArrayList<>();
    Cookie favCookie;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addToCookieToList(Cookie cookie){
        ownedCookies.add(cookie);
        System.out.println("Dodano: " + cookie);
    }

    public Cookie getFavCookie() {
        return favCookie;
    }

    public void setFavCookie(Cookie favCookie) {
        this.favCookie = favCookie;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
