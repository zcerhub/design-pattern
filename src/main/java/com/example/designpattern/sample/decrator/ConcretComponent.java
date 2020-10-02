package com.example.designpattern.sample.decrator;

/*
* 被装饰者
* */
public class ConcretComponent implements Component{
    @Override
    public String methodA() {
        return "concretComponent";
    }

    @Override
    public int methodB() {
        return 100;
    }
}
