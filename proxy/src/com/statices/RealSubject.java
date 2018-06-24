package com.statices;

/**
 * 委托类
 *
 * @author: hua
 * @create: 2018-06-21 21:47
 */
public class RealSubject implements Subject {
    @Override
    public void sell() {
        System.out.println("卖书!");
    }
}
