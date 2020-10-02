package com.example.designpattern.service.impl;

import com.example.designpattern.entity.Order;
import com.example.designpattern.service.PromotionCaculeta;

public class Minus50EveryhundredPromotionCaculeta implements PromotionCaculeta {

    @Override
    public Order caculateOrder(String promotion) {
        System.out.println("正在执行满100送50的活动");
        return null;
    }

}
