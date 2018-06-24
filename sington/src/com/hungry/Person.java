package com.hungry;

/**
 * 多线程懒汉式单例模式
 *
 * @author: hua
 * @create: 2018-06-23 20:07
 */
public class Person {

    private String name;

    private static Person person;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Person() {

    }

    public static Person getPersonSington() {
        if (person != null) {
            //将此方法加锁防止并发
            synchronized (Person.class) {
                if (person != null) {
                    person = new Person();
                }
            }
        }
        return person;
    }


}
