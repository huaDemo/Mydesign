package com.now;

/**
 * @author: hua
 * @create: 2018-06-15 22:48
 */
public class Main {
    public static void main(String[] args) {
        //原始类
        Person person = new Person("zhangsan", "boy", 22);
        System.out.println("修改前:" + person);
        //备份类
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(person.createMemento());
        //修改原始类
        person.setAge(100);
        System.out.println("修改后:" + person);
        //还原原始类
        person.restoreMemento(caretaker.getMemento());
        System.out.println("还原后:" + person);
    }
}
