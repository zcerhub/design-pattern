package com.example.designpattern.controller;

import com.example.designpattern.entity.Order;
import com.example.designpattern.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/strategy")
    public Order orderByStrategy(Order order, String promotion) {
        return orderService.orderByStrategy(order, promotion);
    }

}
