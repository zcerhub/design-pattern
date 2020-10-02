package com.example.designpattern.sample.proxy;

public class TeacherChen implements Boy {

    @Override
    public boolean dating(char cup) {
        if (cup == 'E') {
            System.out.println("这个女老板拼的正好，可以约");
            return true;
        }
        System.out.println("这个女老板品德不好，不可以约");
        return false;
    }

    @Override
    public void show() {
        System.out.println("开始进入拍摄模式");
    }
}
