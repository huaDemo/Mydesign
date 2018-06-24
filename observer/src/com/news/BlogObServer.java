package com.news;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者实体
 *
 * @author: hua
 * @create: 2018-06-24 22:08
 */
public class BlogObServer implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        System.out.println("您关注的博主发表了文章:" + ((Article) o).getTitle());
    }
}
