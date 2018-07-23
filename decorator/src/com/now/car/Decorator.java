package com.now.car;

/**
 * 抽象装饰角色
 *
 * @author: hua
 * @create: 2018-07-23 21:56
 */
public abstract class Decorator extends RunCar {

    private Car car;

    public Decorator(Car car) {
        this.car = car;
    }

    public abstract void show();

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
