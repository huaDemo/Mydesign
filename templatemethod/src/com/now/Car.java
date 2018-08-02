package com.now;

/**
 * AbstractClass（抽象类）
 *
 * @author: hua
 * @create: 2018-08-02 22:10
 */
public abstract class Car {

    /**
     * 组装车(模板方法)
     */
    public void make() {
        this.makeBody();
        this.makeHead();
        this.makeTail();
    }

    /**
     * 组装车身
     */
    public abstract void makeBody();

    /**
     * 组装车头
     */
    public abstract void makeHead();

    /**
     * 组装车尾
     */
    public abstract void makeTail();

}
