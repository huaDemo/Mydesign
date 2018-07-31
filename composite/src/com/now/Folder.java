package com.now;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件（Composite）角色
 *
 * @author: hua
 * @create: 2018-07-31 21:57
 */
public class Folder implements IFile {

    private String name;
    private List<IFile> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<IFile>();
    }

    @Override
    public void display() {
        System.out.println(this.name);
    }

    @Override
    public boolean add(IFile iFile) {
        this.children.add(iFile);
        return true;
    }

    @Override
    public boolean remove(IFile iFile) {
        this.children.remove(iFile);
        return true;
    }

    @Override
    public List<IFile> getChile() {
        return this.children;
    }

}
