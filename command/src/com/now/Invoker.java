package com.now;

/**
 * 发起者
 *
 * @author: hua
 * @create: 2018-07-02 22:08
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }


}
