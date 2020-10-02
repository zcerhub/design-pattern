package com.example.designpattern.sample.method;

public class ChijiGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("ChijiGame正在initialize");
    }

    @Override
    protected void loadMap() {
        System.out.println("ChijiGame正在loadMap");
    }

    @Override
    protected void loadRole() {
        System.out.println("ChijiGame正在loadRole");
    }

    @Override
    protected void startPlay() {
        System.out.println("ChijiGame正在startPlay");
    }

    @Override
    protected void endPlay() {
        System.out.println("ChijiGame正在endPlay");
    }
}
