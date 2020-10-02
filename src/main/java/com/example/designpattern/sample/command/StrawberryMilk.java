package com.example.designpattern.sample.command;

public class StrawberryMilk implements Command{
    @Override
    public void build() {
        System.out.println("make StrawberryMilk");
    }
}
