package code.models;

import java.util.ArrayList;

public class Client {
    private String name;
    private ArrayList<Cookie> ownedCookies = new ArrayList<>();

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
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
