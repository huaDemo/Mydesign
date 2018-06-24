package com.statices;

/**
 * 代理类
 *
 * @author: hua
 * @create: 2018-06-21 21:48
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void sell() {
        System.out.println("begin!");
        subject.sell();
        System.out.println("end!");
    }

}
