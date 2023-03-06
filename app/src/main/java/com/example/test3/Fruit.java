package com.example.test3;

import androidx.annotation.NonNull;

public class Fruit {

    private String name;

    private int imageNum;

    public int getImageNum() {
        return imageNum;
    }

    public void setImageNum(int imageNum) {
        this.imageNum = imageNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fruit(String name, int imageNum) {
        this.name = name;
        this.imageNum = imageNum;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "imageNum=" + imageNum +
                ", name='" + name + '\'' +
                '}';
    }
}
