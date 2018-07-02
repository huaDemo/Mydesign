package com.now;

/**
 * @author: hua
 * @create: 2018-07-02 22:09
 */
public class Main {
    public static void main(String[] args) {
        //创建接受者
        Receiver receiver = new Receiver();
        //创建命令
        Command command = new MyCommand(receiver);
        //创建发起者
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
