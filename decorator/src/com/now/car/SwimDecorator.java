package com.now.car;

/**
 * 具体装饰角色飞游
 *
 * @author: hua
 * @create: 2018-07-23 22:05
 */
public class SwimDecorator extends Decorator implements Car {

    public SwimDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        this.getCar().show();
        this.swim();
    }

    public void swim() {
        System.out.println("汽车在游");
    }

}
