package com.now.car;

/**
 * 具体装饰角色飞
 *
 * @author: hua
 * @create: 2018-07-23 22:00
 */
public class FlyDecorator extends Decorator implements Car{


    public FlyDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        this.getCar().show();
        this.fly();
    }

    public void fly() {
        System.out.println("汽车在飞");
    }

}
