package com.now;


import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 *
 * @author: hua
 * @create: 2018-06-24 21:43
 */
public class MyObServer implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("对象发生了改变!");
    }
}
