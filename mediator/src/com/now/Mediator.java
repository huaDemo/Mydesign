package com.now;

/**
 * 定义抽象Mediator,可以与同事们进行联络
 *
 * @author: hua
 * @create: 2018-07-18 21:54
 */
public abstract class Mediator {

    public abstract void contact(String content, Colleague coll);

}
