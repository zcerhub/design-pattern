package com.example.designpattern.strategyservice;

import com.example.designpattern.entity.Order;

public interface OrderStrategy {

    Order caculateOrder(String promotion);

}
