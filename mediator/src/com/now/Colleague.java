package com.now;

/**
 * @author: hua
 * @create: 2018-07-18 21:55
 */
public class Colleague {

    protected String name;
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

}
