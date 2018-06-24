package com.now;

import com.old.Banana;

/**
 * 具体产品
 *
 * @author: hua
 * @create: 2018-06-20 21:28
 */
public class SourthBanana implements Fruit {
    @Override
    public void get() {
        System.out.println("采集北方香蕉!");
    }
}
