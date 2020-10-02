package com.example.designpattern.factory;

import com.example.designpattern.service.PromotionCaculeta;
import com.example.designpattern.service.impl.GivenOneByEveryTwoPromotionCaculeta;
import com.example.designpattern.service.impl.Minus50EveryhundredPromotionCaculeta;
import org.springframework.stereotype.Component;

@Component
public class PromotionCaculateFactory {


    public PromotionCaculeta getPromotionCaculeta(String promotion) {
        switch (promotion) {
            case "givenOneByEveryTwo":
                return new GivenOneByEveryTwoPromotionCaculeta();
            case "minus50Everyhundr":
                return new Minus50EveryhundredPromotionCaculeta();
        }
        return null;
    }

}
