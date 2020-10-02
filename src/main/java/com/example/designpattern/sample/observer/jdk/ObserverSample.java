package com.example.designpattern.sample.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class ObserverSample {

    public static void main(String[] args) {
        Observable subject = new Observable() {
            @Override
            public synchronized void notifyObservers(Object data) {
                setChanged();
                super.notifyObservers(data);
            }
        };
        subject.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("观察者1更新");
            }
        });
        subject.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("观察者2更新");
            }
        });

        subject.notifyObservers("change1");
        subject.notifyObservers("change2");
    }

}
