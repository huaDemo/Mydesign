package com.now;

/**
 * 定义ConcreteStatesubclasses(具体状态)
 *
 * @author: hua
 * @create: 2018-07-24 22:10
 */
public class Sunshine implements State {

    @Override
    public String getState() {
        return "晴天";
    }

}
