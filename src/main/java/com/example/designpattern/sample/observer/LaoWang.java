package com.example.designpattern.sample.observer;

public class LaoWang implements Observer {
    @Override
    public void update(Object msg) {
        System.out.println(getClass().getSimpleName()+" 女神今天："+msg);
    }
}
