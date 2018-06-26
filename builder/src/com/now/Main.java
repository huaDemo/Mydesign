package com.now;

/**
 * @author: hua
 * @create: 2018-06-26 22:11
 */
public class Main {
    public static void main(String[] args) {
        Builder builder = new GongyuBuilder();
        Director director = new Director();
        House house = director.makeHouse(builder);
        System.out.println(house.getFloor() + "--" + house.getWall() + "--" + house.getHouseTop());
    }
}
