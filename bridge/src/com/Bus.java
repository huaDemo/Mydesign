package com;

/**
 * @author: hua
 * @create: 2018-07-04 22:03
 */
public class Bus extends Car {

    public Bus(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.println("汽车!");
        this.getEngine().install();
    }
}
