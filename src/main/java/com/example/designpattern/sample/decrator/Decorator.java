package com.example.designpattern.sample.decrator;

/*
* 装饰者：包含一个被装饰者，基于被装饰者实现的前后增强实现逻辑，对方法结果进行修改，扩展功能
* 例如：
* 1.本示例，多重促销活动的叠加，不打折+满3件9.9折+满200减10元
* 2.JDK中IO流处理：FileInputStream+BufferedInputStream+LineNumberInputSteam
*
* */

public class Decorator implements Component{

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String methodA() {
        return component.methodA();
    }

    @Override
    public int methodB() {
        return component.methodB();
    }
}
