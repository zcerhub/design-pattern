package com.example.designpattern.service.impl;

import com.example.designpattern.entity.Order;
import com.example.designpattern.service.OrderService;
import org.springframework.stereotype.Component;


@Component("strategy")
public class OrderService4StrategyImpl implements OrderService {


    @Override
    public Order orderByStrategy(Order order, String promotion) {
        switch (promotion) {
            case "givenOneByEveryTwo":
                return new GivenOneByEveryTwoOrderStrategy().caculateOrder(promotion);
            case "minus50Everyhundr":
                return new Minus50EveryhundredOrderStrategy().caculateOrder(promotion);
        }
        return null;
    }
}
