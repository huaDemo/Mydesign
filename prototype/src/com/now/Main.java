package com.now;

/**
 * @author: hua
 * @create: 2018-07-10 21:48
 */
public class Main {
    public static void main(String[] args) {
        //创建person对象
        Person person = new Person();
        person.setName("zhangsan");
        person.setSex("boy");
        person.setAge("18");
        //创建person克隆对象
        Person personClon = person.clon();
        //改变person对象的名称
        person.setName("张三");
        System.out.println(personClon.getName() + "-" + personClon.getSex() + "-" + personClon.getAge());
        //创建一个和person地址相同的对象
        Person person2 = person;
        System.out.println(person2.getName() + "-" + person2.getSex() + "-" + person2.getAge());
    }
}
