package com.miracle.pattern.compsite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Root {
    List<Root> folders = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addFile(Root root) {
        folders.add(root);
    }

    @Override
    public void removeFile(Root root) {
        folders.remove(root);
    }

    @Override
    public void display(int depth) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            builder.append("-");
        }
        System.out.println(builder.toString() + this.getName());

        for (Root folder : folders) {
            folder.display(depth + 2);
        }
    }
}
