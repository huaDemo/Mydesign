package com;

/**
 * @author: hua
 * @create: 2018-07-04 22:05
 */
public class Main {

    public static void main(String[] args) {
        Engine engine2000 = new Engine2000();
        Engine engine2200 = new Engine2200();

        Car bus = new Bus(engine2000);
        bus.installEngine();

        Car jeep = new Jeep(engine2200);
        jeep.installEngine();
    }

}
