package com.now;

/**
 * @author: hua
 * @create: 2018-07-18 22:07
 */
public class Main {

    public static void main(String[] args) {
        //定义中介者
        ConcreteMediator mediator = new ConcreteMediator();
        //定义具体同事类
        ColleagueA colleagueA = new ColleagueA("zhangsan", mediator);
        ColleagueB colleagueB = new ColleagueB("lisi", mediator);
        //中介者开始调用
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);
        colleagueA.contact("我是A,我要找B聊聊!");
        colleagueB.contact("我是B,我要找A聊聊!");
    }

}
