package com.example.designpattern.sample.proxy;


import com.example.designpattern.sample.proxy.staticproxy.TeacherCang;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDemo {

//    功能增强的实现
    static class MyMethodInterceptor implements MethodInterceptor {

    private Object target;

    public MyMethodInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("********************"+method.getName());
//        前置增强
        doSomethingBefore();
//        返回值
        Object res=null;
//        调用父类的该方法，当时生成接口的代理不可调用
//        Object res=methodProxy.invokeSuper(proxy,args);
//        通过method来调用被代理对象的方法
        if (this.target != null) {
            res = method.invoke(target, args);
        }
//        后置增强
        doSomethingAfter();
        return res;
    }

    private void doSomethingAfter() {
        System.out.println("cglib代理生成类中的doSomethingAfter");
    }

    private void doSomethingBefore() {
        System.out.println("cglib代理生成类中的doSomethingBefore");
    }
}

    public static void main(String[] args) {
        Enhancer e = new Enhancer();
        TeacherCang tc = new TeacherCang();
//        设置增强回调
        e.setCallback(new MyMethodInterceptor(tc));
//        获得接口代理类
        e.setInterfaces(new Class[]{Girl.class});
        Girl g = (Girl) e.create();
        g.dating(1.8F);

        ProxyUtils.generateClassFile(Girl.class,g.getClass().getName());
        System.out.println("------------------------------------");
//         对类生成代理对象
        e.setSuperclass(TeacherCang.class);
        e.setInterfaces(null);
//        当有多个callback时，需要通过callbackFilter来指定被代理方法使用第几个callback
   /*     e.setCallbackFilter(new CallbackFilter() {
            @Override
            public int accept(Method method) {
                return 0;
            }
        });*/
        TeacherCang proxy = (TeacherCang) e.create();
        proxy.dating(1.8f);

        ProxyUtils.generateClassFile(TeacherCang.class,proxy.getClass().getName());
    }

}
