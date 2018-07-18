package com.now;

/**
 * 定义具体中介者ConcreteMediator,具体中介者通过协调各同事对象实现协作行为，了解并维护它的各个同事。
 *
 * @author: hua
 * @create: 2018-07-18 22:02
 */
public class ConcreteMediator extends Mediator {

    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public ColleagueA getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public ColleagueB getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void contact(String content, Colleague coll) {
        if (coll == colleagueA) {
            colleagueB.getMessage(content);
        } else {
            colleagueA.getMessage(content);
        }
    }
}
