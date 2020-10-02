package com.example.designpattern.service;

import com.example.designpattern.entity.Order;

public interface OrderService {
    Order orderByStrategy(Order order, String promotion);
}
