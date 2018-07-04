package com;

/**
 * @author: hua
 * @create: 2018-07-04 22:01
 */
public abstract class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void installEngine();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
