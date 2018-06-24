package com.now;

/**
 * 抽象工厂类
 *
 * @author: hua
 * @create: 2018-06-20 21:48
 */
public interface FruitFactory {
    /**
     * 获取苹果
     *
     * @return
     */
    Fruit getApple();

    /**
     * 获取香蕉
     *
     * @return
     */
    Fruit getBanana();
}
