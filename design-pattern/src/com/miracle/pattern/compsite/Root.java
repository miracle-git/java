package com.miracle.pattern.compsite;

public abstract class Root {
    private String name;

    public Root(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void addFile(Root root);
    public abstract void removeFile(Root root);
    public abstract void display(int depth);
}
