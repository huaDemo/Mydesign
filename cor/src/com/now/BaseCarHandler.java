package com.now;

/**
 * @author: hua
 * @create: 2018-07-12 21:49
 */
public abstract class BaseCarHandler {

    protected BaseCarHandler baseCarHandler;

    public BaseCarHandler setNextHandler(BaseCarHandler baseCarHandler) {
        this.baseCarHandler = baseCarHandler;
        return this.baseCarHandler;
    }

    /**
     * 组装车辆
     *
     * @return
     */
    public abstract void handlerCar();

}
