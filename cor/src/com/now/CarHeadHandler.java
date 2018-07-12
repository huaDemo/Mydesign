package com.now;

/**
 * @author: hua
 * @create: 2018-07-12 21:53
 */
public class CarHeadHandler extends BaseCarHandler {

    @Override
    public void handlerCar() {
        System.out.println("组装车头!");
        if (this.baseCarHandler != null) {
            this.baseCarHandler.handlerCar();
        }
    }

}
