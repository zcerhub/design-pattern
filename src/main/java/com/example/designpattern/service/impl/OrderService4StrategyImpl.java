package com.example.designpattern.service.impl;

import com.example.designpattern.entity.Order;
import com.example.designpattern.factory.PromotionCaculateFactory;
import com.example.designpattern.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("strategy")
public class OrderService4StrategyImpl implements OrderService {

    @Autowired
    private PromotionCaculateFactory promotionCaculateFactory;

    @Override
    public Order orderByStrategy(Order order, String promotion) {
        return promotionCaculateFactory.getPromotionCaculeta(promotion).caculateOrder(promotion);
    }

}
