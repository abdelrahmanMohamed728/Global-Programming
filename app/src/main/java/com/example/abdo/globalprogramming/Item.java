package com.example.abdo.globalprogramming;

import java.io.Serializable;

public class Item implements Serializable
{
    private int img;
    private String Info;

    public Item(int img, String info) {
        this.img = img;
        Info = info;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }
}
