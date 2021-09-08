package main;

import com.jaunt.ResponseException;
import com.jaunt.UserAgent;

public class Main {
    public static void main(String[] args) {
        UserAgent userAgent = new UserAgent();
        try {
            userAgent.visit("https://www.google.com.tw/webhp?hl=zh-TW");
            System.out.println(userAgent.doc.innerHTML());
        } catch (ResponseException e) {
            e.printStackTrace();
        }
    }
}
