package com.now;

/**
 * @author: hua
 * @create: 2018-08-02 22:15
 */
public class Main {

    public static void main(String[] args) {
        Car busCar = new BusCar();
        busCar.make();
        System.out.println("------------");
        Car jeepCar = new JeepCar();
        jeepCar.make();
    }

}
