package com.example.designpattern.sample.responsibility;

public class ResponsibilityA implements Responsibility{
    @Override
    public void process(Request request, ResponsibilityChain chain) {
        System.out.println("ResponsibilityA");
        chain.process(request);
    }
}
