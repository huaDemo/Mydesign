package com.now;

/**
 * @author: hua
 * @create: 2018-07-12 21:44
 */
public class Main {
    public static void main(String[] args) {
        BaseCarHandler headH = new CarHeadHandler();
        BaseCarHandler bodyH = new CarBodyHandler();
        BaseCarHandler tailH = new CarTailHandler();
        //车尾 -> 车头 -> 车身
        tailH.setNextHandler(headH).setNextHandler(bodyH);
        tailH.handlerCar();
    }
}
