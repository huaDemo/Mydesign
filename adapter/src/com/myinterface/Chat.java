package com.myinterface;

/**
 * @author: hua
 * @create: 2018-07-05 22:19
 */
public class Chat extends Wrapper {

    @Override
    public void net() {
        System.out.println("Hello world!");
    }

    @Override
    public void ftp() {
        System.out.println("File upload succeddful!");
    }
}
