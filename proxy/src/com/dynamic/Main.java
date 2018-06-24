package com.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


/**
 * @author: hua
 * @create: 2018-06-21 22:09
 */
public class Main {
    public static void main(String[] args) {
        //要代理的真实对象
        RealSubject realSubject = new RealSubject();
        //创建中介类实例
        InvocationHandler handler = new ProxyFactory(realSubject);
        //获取类加载器
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        //动态产生一个代理类
        Subject proxySubject = (Subject)Proxy.newProxyInstance(classLoader,realSubject.getClass().getInterfaces(),handler);
        //通过代理类，执行sell方法；
        proxySubject.sell();
    }
}
