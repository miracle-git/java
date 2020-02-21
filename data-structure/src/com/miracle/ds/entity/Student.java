package com.miracle.ds.entity;

public class Student {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("(Student: name = %s, score = %d)", name, score);
    }
}