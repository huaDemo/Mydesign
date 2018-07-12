package com.now;

/**
 * @author: hua
 * @create: 2018-07-12 22:03
 */
public class CarTailHandler extends BaseCarHandler {
    @Override
    public void handlerCar() {
        System.out.println("组装车尾!");
        if (this.baseCarHandler != null) {
            this.baseCarHandler.handlerCar();
        }
    }
}
