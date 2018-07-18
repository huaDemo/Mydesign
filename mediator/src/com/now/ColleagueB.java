package com.now;

/**
 * @author: hua
 * @create: 2018-07-18 21:59
 */
public class ColleagueB extends Colleague {

    /**
     * 具体同事类继承自Colleague,此刻就可以与中介者mediator进行通信了
     *
     * @param name
     * @param mediator
     */
    public ColleagueB(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void getMessage(String message) {
        System.out.println("同事B" + this.name + "获得信息" + message);
    }

    /**
     * 同事B与中介者通信
     *
     * @param message
     */
    public void contact(String message) {
        mediator.contact(message, this);
    }

}
