package com.now;

import java.util.List;

/**
 * @author: hua
 * @create: 2018-07-31 22:01
 */
public class Main {

    public static void main(String[] args) {
        //c盘
        Folder rootFolder = new Folder("c:");
        //test目录
        Folder testFolder = new Folder("test");
        //A.txt
        File file = new File("A.txt");

        //test2目录
        Folder test2Folder = new Folder("test2");
        //B.txt
        File bfile = new File("B.txt");
        test2Folder.add(bfile);

        rootFolder.add(testFolder);
        rootFolder.add(file);
        testFolder.add(test2Folder);
        Main.displayTree(rootFolder, 0);

    }

    public static void displayTree(IFile rootFile, int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.print("--");
        }
        //显示自身名称
        rootFile.display();
        //获取子树
        List<IFile> children = rootFile.getChile();
        //遍历子树
        for (IFile iFile : children) {
            if (iFile instanceof File) {
                for (int i = 0; i <= deep; i++) {
                    System.out.print("--");
                }
                iFile.display();
            } else {
                displayTree(iFile, deep + 1);
            }
        }
    }

}
