package com.example.designpattern.strategyservice.impl;

import com.example.designpattern.entity.Order;
import com.example.designpattern.strategyservice.OrderStrategy;

public class GivenOneByEveryTwoOrderStrategy implements OrderStrategy {

    @Override
    public Order caculateOrder(String promotion) {
        System.out.println("正在执行每两件送一件的活动");
        return null;
    }

}
