package com.statices;

/**
 * @author: hua
 * @create: 2018-06-21 21:50
 */
public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.sell();
    }
}
