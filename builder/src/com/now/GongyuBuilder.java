package com.now;

/**
 * @author: hua
 * @create: 2018-06-26 22:08
 */
public class GongyuBuilder implements Builder {

    private House house;

    public GongyuBuilder() {
        this.house = new House();
    }

    @Override
    public void makeFloor() {
        house.setFloor("公寓建地板");
    }

    @Override
    public void makeWall() {
        house.setWall("公寓刷墙");
    }

    @Override
    public void makeHouseTop() {
        house.setHouseTop("公寓建房顶");
    }

    @Override
    public House createHuman() {
        return this.house;
    }
}
