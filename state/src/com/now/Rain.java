package com.now;

/**
 * 定义ConcreteStatesubclasses(具体状态)
 *
 * @author: hua
 * @create: 2018-07-24 22:11
 */
public class Rain implements State {

    @Override
    public String getState() {
        return "雨天";
    }

}
