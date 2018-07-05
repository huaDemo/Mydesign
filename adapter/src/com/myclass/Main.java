package com.myclass;

/**
 * @author: hua
 * @create: 2018-07-05 22:08
 */
public class Main {
    public static void main(String[] args) {
        //类适配器
        Adapter1 adapter1 = new Adapter1();
        adapter1.isPs2();
        //对象适配器
        Adapter2 adapter2 = new Adapter2(new Usber());
        adapter2.isPs2();
    }
}
