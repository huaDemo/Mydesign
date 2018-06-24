package com.lazy;

/**
 * 饿汉式单例模式
 *
 * @author: hua
 * @create: 2018-06-23 20:02
 */
public class Person {

    private String name;

    //静态常量保证只能加载一次
    public static final Person person = new Person();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //构造方法私有
    private Person() {

    }

    //提供一个静态的方法获取对象
    public static Person getPersonSington() {
        return person;
    }

}
