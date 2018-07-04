package com;

/**
 * @author: hua
 * @create: 2018-07-04 22:05
 */
public class Jeep extends Car {

    public Jeep(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.println("吉普!");
        this.getEngine().install();
    }
}
