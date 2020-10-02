package com.example.designpattern.sample.command;

public class TasteMilk implements Command{
    @Override
    public void build() {
        System.out.println("make TasteMilk");
    }
}
