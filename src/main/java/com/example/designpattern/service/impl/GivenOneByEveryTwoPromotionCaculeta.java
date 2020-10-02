package com.example.designpattern.service.impl;

import com.example.designpattern.entity.Order;
import com.example.designpattern.service.PromotionCaculeta;

public class GivenOneByEveryTwoPromotionCaculeta implements PromotionCaculeta {

    @Override
    public Order caculateOrder(String promotion) {
        System.out.println("正在执行每两件送一件的活动");
        return null;
    }

}
