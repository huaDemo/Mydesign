package com.now;

import java.util.List;

/**
 * 叶子构件（Leaf）角色
 *
 * @author: hua
 * @create: 2018-07-31 21:55
 */
public class File implements IFile {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(this.name);
    }

    @Override
    public boolean add(IFile iFile) {
        return false;
    }

    @Override
    public boolean remove(IFile iFile) {
        return false;
    }

    @Override
    public List<IFile> getChile() {
        return null;
    }
}
