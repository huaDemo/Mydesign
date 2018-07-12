package com.now;

/**
 * @author: hua
 * @create: 2018-07-12 22:02
 */
public class CarBodyHandler extends BaseCarHandler {
    @Override
    public void handlerCar() {
        System.out.println("组装车身!");
        if (this.baseCarHandler != null) {
            this.baseCarHandler.handlerCar();
        }
    }
}
