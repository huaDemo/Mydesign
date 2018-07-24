package com.now;

/**
 * 定义和Context中的状态相对应的行为(抽象状态)
 *
 * @author: hua
 * @create: 2018-07-24 22:05
 */
public interface State {
    /**
     * 获取天气情况
     *
     * @return
     */
    String getState();
}
