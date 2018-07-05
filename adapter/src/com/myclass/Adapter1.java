package com.myclass;

/**
 * 类适配器
 *
 * @author: hua
 * @create: 2018-07-05 22:06
 */
public class Adapter1 extends Usber implements Ps2 {

    @Override
    public void isPs2() {
        super.isUsb();
        System.out.println("类适配器转换成功!");
    }

}
