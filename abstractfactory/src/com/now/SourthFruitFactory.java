package com.now;

/**
 * 具体工厂类
 *
 * @author: hua
 * @create: 2018-06-20 21:55
 */
public class SourthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new SourthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SourthBanana();
    }
}
