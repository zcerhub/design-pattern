package com.example.designpattern.sample.method;

public class Play {

    public static void main(String[] args) {
        Game wzry = new WangZheRongyaoGame();
        wzry.play();

        System.out.println();
        Game cj = new ChijiGame();
        cj.play();
    }

}
