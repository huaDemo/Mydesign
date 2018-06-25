package com.now;

/**
 * @author: hua
 * @create: 2018-06-25 21:49
 */
public class FruitFactory {

    /**
     * 简单工厂放射实现
     *
     * @param type
     * @return
     */
    public static Fruit getFruit(String type) {
        try {
            Class fruit = Class.forName(type);
            return (Fruit) fruit.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

}
