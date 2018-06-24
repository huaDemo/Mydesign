package com.now;

/**
 * @author: hua
 * @create: 2018-06-24 21:47
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        //注册一个观察者(可以注册多个)
        person.addObserver(new MyObServer());
        person.setName("zhangsan");
    }
}
