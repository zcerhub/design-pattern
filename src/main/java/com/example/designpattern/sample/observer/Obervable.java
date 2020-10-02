package com.example.designpattern.sample.observer;

public interface Obervable {
    void addObserver(Observer observer);

    void remvoeObserver(Observer observer);

    void notifyObservers();

}
