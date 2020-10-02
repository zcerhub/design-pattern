package com.example.designpattern.sample.decrator;

/*
* 功能增强
* */
public class DecoratorA  extends Decorator{
    public DecoratorA(Component component) {
        super(component);
    }


    @Override
    public String methodA() {
        return component.methodA()+",DecoratorA";
    }

    @Override
    public int methodB() {
        return component.methodB()+100;
    }

}
