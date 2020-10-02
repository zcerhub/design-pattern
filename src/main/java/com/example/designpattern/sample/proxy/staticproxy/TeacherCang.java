package com.example.designpattern.sample.proxy.staticproxy;

import com.example.designpattern.sample.proxy.Girl;

public class TeacherCang implements Girl {
    @Override
    public boolean dating(float length) {
        if (length > 1.7F) {
            System.out.println("身高可以，可以约！");
            return true;
        }
        System.out.println("身高不可以，不可约！");
        return false;
    }
}
