package com.news;

import java.util.Observable;

/**
 * 博主(被观察者)
 *
 * @author: hua
 * @create: 2018-06-24 22:03
 */
public class BlogUser extends Observable {

    /**
     * 发表文章
     *
     * @param article
     */
    public void init(Article article) {
        this.setChanged();
        this.notifyObservers(article);
        System.out.println("我是博主,我刚发表了文章!");
    }


}
