package com.now;

/**
 * @author: hua
 * @create: 2018-07-24 22:13
 */
public class Main {
    public static void main(String[] args) {
        //创建环境角色
        Context context = new Context();
        //设置状态为晴天
        context.setState(new Sunshine());
        System.out.println(context.stateMessage());
        //设置状态为雨天
        context.setState(new Rain());
        System.out.println(context.stateMessage());
    }
}
