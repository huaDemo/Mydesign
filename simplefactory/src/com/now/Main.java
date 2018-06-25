package com.now;

/**
 * @author: hua
 * @create: 2018-06-25 21:55
 */
public class Main {
    public static void main(String[] args) {
       Fruit fruit = FruitFactory.getFruit("com.now.Apple");
       fruit.get();
    }
}
