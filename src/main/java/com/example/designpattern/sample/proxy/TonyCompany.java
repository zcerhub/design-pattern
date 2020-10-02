package com.example.designpattern.sample.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* 经纪人公司，JDK动态代理实现
* */
public class TonyCompany {

    public static Object proxy(Object target) {
//        只能基于接口代理
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new MyInnovationHandler(target));
    }

//    功能增强实现
    private static class MyInnovationHandler implements InvocationHandler {
        private Object target;
        public MyInnovationHandler(Object target) {
            this.target=target;
        }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//            前置增强
        doSomethingBefore();

        Object res = method.invoke(target, args);

//        后置增强
        doSomethingAfter();
        return res;
    }

    private void doSomethingAfter() {
        System.out.println("在jdk动态代理中，doSomethingAfter");
    }

    private void doSomethingBefore() {
        System.out.println("在jdk动态代理中，doSomethingBefore");
    }
}
}
