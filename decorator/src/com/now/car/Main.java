package com.now.car;

/**
 * @author: hua
 * @create: 2018-07-23 22:02
 */
public class Main {
    public static void main(String[] args) {
        //初始化汽车
        Car car = new RunCar();
        //装饰飞
        Car flyCar = new FlyDecorator(car);
        //装饰游
        Car swimCar= new SwimDecorator(flyCar);
        swimCar.show();
    }
}
