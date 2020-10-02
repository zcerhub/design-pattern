package com.example.designpattern.service;

import com.example.designpattern.entity.Order;

public interface OrderStrategy {

    Order caculateOrder(String promotion);

}
