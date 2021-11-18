package com.miracle.pattern.client;

import com.miracle.pattern.compsite.File;
import com.miracle.pattern.compsite.Folder;
import com.miracle.pattern.compsite.Root;

public class CompsiteClient {
    public static void run() {
        // 根文件夹
        Root root = new Folder("C://");
        // 子文件夹
        Root desktop = new Folder("桌面");
        Root myComputer = new Folder("我的电脑");
        // 子文件
        Root javaFile = new File("hello.java");

        // 添加文件夹
        root.addFile(desktop);
        root.addFile(myComputer);

        // 添加文件
        myComputer.addFile(javaFile);

        // 展示
        root.display(0);
    }
}
