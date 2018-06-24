package com.old;

/**
 * @author: hua
 * @create: 2018-06-15 22:28
 */
public class Main {
    public static void main(String[] args) {
        //原始类
        Person person = new Person("zhangsan", "boy", 21);
        System.out.println("修改前:" + person);
        //备份类
        Person backup = new Person(person.getName(), person.getSex(), person.getAge());
        //修改原始类
        person.setAge(100);
        System.out.println("修改后:" + person);
        //还原原始类
        person.setName(backup.getName());
        person.setSex(backup.getSex());
        person.setAge(backup.getAge());
        System.out.println("还原后:" + person);
    }
}
