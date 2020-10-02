package com.example.designpattern.sample.responsibility;

public class ResponsibilityB implements Responsibility{
    @Override
    public void process(Request request, ResponsibilityChain chain) {
        System.out.println("ResponsibilityB");
        chain.process(request);
    }
}
