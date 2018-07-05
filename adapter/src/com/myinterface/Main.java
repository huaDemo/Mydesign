package com.myinterface;

/**
 * @author: hua
 * @create: 2018-07-05 22:25
 */
public class Main {

    private static Port chatPort = new Chat();

    public static void main(String[] args) {
        chatPort.net();
        chatPort.ftp();
    }

}
