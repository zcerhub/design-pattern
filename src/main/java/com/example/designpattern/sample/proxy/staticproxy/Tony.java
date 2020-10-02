package com.example.designpattern.sample.proxy.staticproxy;

import com.example.designpattern.sample.proxy.Girl;

public class Tony implements Girl {

    private Girl girl;

    public Tony(Girl girl) {
        this.girl = girl;
    }

    @Override
    public boolean dating(float length) {
//        前置增强
        doSomethingBefore();
       boolean res= girl.dating(length);
//        后置增强
        doSomethingAfter();
        return res;
    }

    private void doSomethingAfter() {
        System.out.println("后置增强");
    }

    private void doSomethingBefore() {
        System.out.println("前置增强");
    }
}
