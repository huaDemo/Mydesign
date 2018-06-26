package com.now;

/**
 * @author: hua
 * @create: 2018-06-26 22:04
 */
public interface Builder {
    /**
     * 建地板
     */
    void makeFloor();

    /**
     * 刷墙
     */
    void makeWall();

    /**
     * 建房顶
     */
    void makeHouseTop();

    /**
     * 建造房子
     *
     * @return
     */
    House createHuman();


}
