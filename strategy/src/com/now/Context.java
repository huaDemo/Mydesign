package com.now;

/**
 * 封装类
 *
 * @author: hua
 * @create: 2018-06-19 17:40
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 封装后调用加密方法
     */
    public void encrypt() {
        this.strategy.encrypt();
    }
}
