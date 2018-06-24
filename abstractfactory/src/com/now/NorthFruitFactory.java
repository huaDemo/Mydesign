package com.now;

/**
 * 具体工厂类
 *
 * @author: hua
 * @create: 2018-06-20 21:54
 */
public class NorthFruitFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }
}
