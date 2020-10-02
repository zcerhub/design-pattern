package com.example.designpattern.sample.proxy.staticproxy;

import com.example.designpattern.sample.proxy.Girl;

public class TuHao{

    private float length;

    public TuHao(float length) {
        this.length = length;
    }

    public void dating(Girl girl) {
        girl.dating(length);
    }

}
