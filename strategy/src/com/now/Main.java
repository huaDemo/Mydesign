package com.now;

/**
 * @author: hua
 * @create: 2018-06-19 17:45
 */
public class Main {
    public static void main(String[] args) {
        /*MD5Strategy md5Strategy = new MD5Strategy();
        md5Strategy.encrypt();*/
        //调用md5加密
        Context context = new Context(new MD5Strategy());
        context.encrypt();
    }
}
