package com.now;

import java.util.Observable;

/**
 * 被观察者
 *
 * @author: hua
 * @create: 2018-06-24 21:37
 */
public class Person extends Observable {

    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //标志着这 Observable对象为已更改；的 hasChanged方法将返回 true。
        this.setChanged();
        //如果这个对象已经发生了变化，由 hasChanged方法表明，然后通知所有的观察者，然后调用 clearChanged方法表明该对象已不再改变。
        this.notifyObservers();
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        //标志着这 Observable对象为已更改；的 hasChanged方法将返回 true。
        this.setChanged();
        //如果这个对象已经发生了变化，由 hasChanged方法表明，然后通知所有的观察者，然后调用 clearChanged方法表明该对象已不再改变。
        this.notifyObservers();
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //标志着这 Observable对象为已更改；的 hasChanged方法将返回 true。
        this.setChanged();
        //如果这个对象已经发生了变化，由 hasChanged方法表明，然后通知所有的观察者，然后调用 clearChanged方法表明该对象已不再改变。
        this.notifyObservers();
        this.age = age;
    }
}
