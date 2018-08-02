package com.now;

/**
 * ConcreteClass（具体子类）
 *
 * @author: hua
 * @create: 2018-08-02 22:13
 */
public class BusCar extends Car {
    @Override
    public void makeBody() {
        System.out.println("bus:组装车身");
    }

    @Override
    public void makeHead() {
        System.out.println("bus:组装车头");
    }

    @Override
    public void makeTail() {
        System.out.println("bus:组装车尾");
    }
}
