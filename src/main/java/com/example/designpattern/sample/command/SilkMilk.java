package com.example.designpattern.sample.command;

public class SilkMilk implements Command{
    @Override
    public void build() {
        System.out.println("make SilkMilk");
    }
}
