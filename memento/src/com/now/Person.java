package com.now;

/**
 * @author: hua
 * @create: 2018-06-15 22:25
 */
public class Person {
    private String name;
    private String sex;
    private int age;

    public Person() {
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 创建一个备忘录实体
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(this.name, this.sex, this.age);
    }

    /**
     * 还原实体
     *
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.setName(memento.getName());
        this.setSex(memento.getSex());
        this.setAge(memento.getAge());
    }


}
