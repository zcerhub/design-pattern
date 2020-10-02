package com.example.designpattern.sample.method;

public class WangZheRongyaoGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("WangZheRongyaoGame正在initialize");
    }

    @Override
    protected void loadMap() {
        System.out.println("WangZheRongyaoGame正在loadMap");
    }

    @Override
    protected void loadRole() {
        System.out.println("WangZheRongyaoGame正在loadRole");
    }

    @Override
    protected void startPlay() {
        System.out.println("WangZheRongyaoGame正在startPlay");
    }

    @Override
    protected void endPlay() {
        System.out.println("WangZheRongyaoGame正在endPlay");
    }
}
