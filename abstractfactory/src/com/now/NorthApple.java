package com.now;

import com.old.Apple;

/**
 * 具体产品
 *
 * @author: hua
 * @create: 2018-06-20 21:26
 */
public class NorthApple implements Fruit {

    @Override
    public void get() {
        System.out.println("采集南方苹果!");
    }

}
