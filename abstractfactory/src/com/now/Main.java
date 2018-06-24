package com.now;

/**
 * @author: hua
 * @create: 2018-06-20 21:55
 */
public class Main {
    public static void main(String[] args) {
        //获取南方的苹果和香蕉
        FruitFactory fruitFactory = new NorthFruitFactory();
        Fruit fruit1 = fruitFactory.getApple();
        fruit1.get();
        Fruit fruit2 = fruitFactory.getBanana();
        fruit2.get();
        //获取北方的苹果和香蕉
        FruitFactory fruitFactory1 = new SourthFruitFactory();
        Fruit fruit3 = fruitFactory1.getApple();
        fruit3.get();
        Fruit fruit4 = fruitFactory1.getBanana();
        fruit4.get();

    }
}
