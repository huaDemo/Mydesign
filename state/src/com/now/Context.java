package com.now;

/**
 * 定义当前的状态(环境角色)
 *
 * @author: hua
 * @create: 2018-07-24 22:07
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String stateMessage() {
        return state.getState();
    }

}
