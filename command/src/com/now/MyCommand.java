package com.now;

/**
 * 命令类
 *
 * @author: hua
 * @create: 2018-07-02 22:06
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

}
