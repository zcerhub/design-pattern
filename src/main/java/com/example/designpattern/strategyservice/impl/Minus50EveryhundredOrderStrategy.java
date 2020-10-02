package com.example.designpattern.strategyservice.impl;

import com.example.designpattern.entity.Order;
import com.example.designpattern.strategyservice.OrderStrategy;

public class Minus50EveryhundredOrderStrategy implements OrderStrategy {

    @Override
    public Order caculateOrder(String promotion) {
        System.out.println("正在执行满100送50的活动");
        return null;
    }

}
