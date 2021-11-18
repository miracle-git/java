package com.miracle.pattern.compsite;

public class File extends Root {
    public File(String name) {
        super(name);
    }

    @Override
    public void addFile(Root root) {

    }

    @Override
    public void removeFile(Root root) {

    }

    @Override
    public void display(int depth) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            builder.append("-");
        }
        System.out.println(builder.toString() + this.getName());
    }
}
