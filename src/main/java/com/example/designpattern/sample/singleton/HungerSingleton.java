package com.example.designpattern.sample.singleton;

/*
* 饥汉式单例
* */

public class HungerSingleton {

    private final static HungerSingleton instance = new HungerSingleton();

    private HungerSingleton() {

    }

    public static HungerSingleton getInstance() {
        return instance;
    }

}
