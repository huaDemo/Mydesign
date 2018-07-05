package com.myinterface;

/**
 * @author: hua
 * @create: 2018-07-05 22:14
 */
public interface Port {

    // 远程SSH端口22
    void ssh();

    // 网络端口80
    void net();

    // Tomcat容器端口8080
    void tomcat();

    // Mysql数据库端口3306
    void mysql();

    // Oracle数据库端口1521
    void oracle();

    // 文件传输FTP端口21
    void ftp();

}
