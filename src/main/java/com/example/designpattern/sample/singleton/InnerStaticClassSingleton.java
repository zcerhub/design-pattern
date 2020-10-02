package com.example.designpattern.sample.singleton;

/*
* 静态内部类只会在需要的时候进行加载，内部属性只会在第一次加载类的时候进行初始化
* 通过JVM类加载机制确保线程安全，类进行初始化时，其他线程无法进入
* */

public class InnerStaticClassSingleton {

    private InnerStaticClassSingleton() {

    }

    private static class InstanceHolder{
        final static InnerStaticClassSingleton SINGLETON = new InnerStaticClassSingleton();
    }

    public static InnerStaticClassSingleton getInstance() {
        return InstanceHolder.SINGLETON;
    }
}
