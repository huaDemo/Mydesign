package com.myclass;

/**
 * 对象适配器
 *
 * @author: hua
 * @create: 2018-07-05 22:10
 */
public class Adapter2 implements Ps2 {

    private Usb usb;

    public Adapter2(Usber usber) {
        this.usb = usber;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
        System.out.println("对象适配器转换成功!");
    }
}
