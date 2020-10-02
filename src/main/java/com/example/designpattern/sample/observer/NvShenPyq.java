package com.example.designpattern.sample.observer;

import java.util.ArrayList;
import java.util.List;

public class NvShenPyq implements Obervable {
    private List<Observer> fans = new ArrayList<>();
    private String msg;

    @Override
    public void addObserver(Observer observer) {
        fans.add(observer);
    }

    @Override
    public void remvoeObserver(Observer observer) {
        fans.remove(observer);
    }

    @Override
    public void notifyObservers() {
        fans.forEach(fan->{
            fan.update(msg);
        });
    }

    public void pushMessage(String msg) {
        this.msg = msg;
        System.out.println("发个朋友圈");
        notifyObservers();
    }
}
