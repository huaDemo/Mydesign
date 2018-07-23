package com.now.car;

/**
 * 具体组件角色
 *
 * @author: hua
 * @create: 2018-07-23 21:54
 */
public class RunCar implements Car {

    @Override
    public void run() {
        System.out.println("汽车在跑");
    }

    @Override
    public void show() {
        this.run();
    }

}
