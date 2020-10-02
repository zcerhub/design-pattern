package com.example.designpattern.sample.decrator;

public class DecoratorSample {

    public static void main(String[] args) {
        //被装饰者，需要基于它进行扩展，当然装饰者也可以称为被装饰者
        Component cc = new ConcretComponent();
//        装饰者
        Component c = new Decorator(cc);
//        装饰者称为被装饰者，通过这种方式可以修饰无数个被装饰者
        Component d = new DecoratorA(c);
//        客户端只看到了Component
        System.out.println(d.methodA());
        System.out.println(d.methodB());
    }

}
