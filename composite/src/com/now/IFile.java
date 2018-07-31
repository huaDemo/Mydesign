package com.now;

import java.util.List;

/**
 * 抽象组件（Component）角色
 *
 * @author: hua
 * @create: 2018-07-31 21:51
 */
public interface IFile {

    /**
     * 显示文件或者文件夹的名称
     */
    void display();

    /**
     * 添加文件
     *
     * @param iFile
     * @return
     */
    boolean add(IFile iFile);

    /**
     * 移除文件
     *
     * @param iFile
     * @return
     */
    boolean remove(IFile iFile);

    /**
     * 获取所有子节点
     *
     * @return
     */
    List<IFile> getChile();

}
