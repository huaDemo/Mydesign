package com.now;

/**
 * @author: hua
 * @create: 2018-06-26 22:09
 */
public class Director {

    public House makeHouse(Builder builder) {
        builder.makeFloor();
        builder.makeWall();
        builder.makeHouseTop();
        return builder.createHuman();
    }

}
