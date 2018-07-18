package com.now;

/**
 * @author: hua
 * @create: 2018-07-18 21:56
 */
public class ColleagueA extends Colleague {

    /**
     * 具体同事类继承自Colleague,此刻就可以与中介者mediator进行通信了
     *
     * @param name
     * @param mediator
     */
    public ColleagueA(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void getMessage(String message) {
        System.out.println("同事A" + this.name + "获得信息" + message);
    }

    /**
     * 同事A与中介者通信
     *
     * @param message
     */
    public void contact(String message) {
        mediator.contact(message, this);
    }

}
