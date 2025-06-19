package code.models;

import java.util.HashMap;

public class Storage {
    HashMap<Cookie, Integer> cookieStorageMap = new HashMap<Cookie, Integer>();

    public void addCookieToStorage(Cookie cookie, Integer value){
        if(value > 0){
            cookieStorageMap.put(cookie, value);
        }
    }

    public void count(){
        System.out.println("Counting...");
    }

    @Override
    public String toString() {
        return "Storage{" +
                "cookieStorageMap=" + cookieStorageMap +
                '}';
    }
}
