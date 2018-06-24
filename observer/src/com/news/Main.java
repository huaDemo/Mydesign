package com.news;

/**
 * @author: hua
 * @create: 2018-06-24 22:10
 */
public class Main {
    public static void main(String[] args) {
        Article article = new Article();
        article.setTitle("<访问者模式>");
        article.setContent("这是一个访问者模式的实例");
        BlogUser blogUser = new BlogUser();
        blogUser.addObserver(new BlogObServer());
        blogUser.init(article);

    }
}
