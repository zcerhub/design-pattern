package com.example.designpattern.sample.state;

public class CoffeeMachine {

    final static int NO_PAY=0;
    final static int PAY=1;
    final static int SOLD=2;
    final static int SOLD_OUT=3;

    private int state = SOLD_OUT;
    private int store;

    public CoffeeMachine(int store) {
        this.store = store;
        if (this.store > 0) {
            this.state = NO_PAY;
        }
    }

    public void pay() {
        switch (this.state) {
            case NO_PAY:
                System.out.println("支付成功，请正确购买咖啡");
                this.state = PAY;
                break;
            case PAY:
                System.out.println("已经支付成功，请确定购买咖啡");
                break;
            case SOLD:
                System.out.println("代取咖啡中，请稍后购买!");
                break;
            case SOLD_OUT:
                System.out.println("咖啡已经卖完，请下次再来");
        }
    }

    public void refund() {
        switch (this.state) {
            case NO_PAY:
                System.out.println("你尚未支付，请投入money");
                break;
            case PAY:
                System.out.println("退款成功");
                break;
            case SOLD:
                System.out.println("已购买，请取用！");
                break;
            case SOLD_OUT:
                System.out.println("咖啡已经卖完，不可购买");
        }
    }

    public void buy() {
        switch (this.state) {
            case NO_PAY:
                System.out.println("你尚未支付，请投入money");
                break;
            case PAY:
                System.out.println("购买成功");
                break;
            case SOLD:
                System.out.println("已购买，请取用！");
                break;
            case SOLD_OUT:
                System.out.println("咖啡已经卖完，不可购买");
        }
    }

    public void getCoffee() {
        switch (this.state) {
            case NO_PAY:
                System.out.println("你尚未支付，请投入money");
                break;
            case PAY:
                System.out.println("退款成功");
                break;
            case SOLD:
                System.out.println("请放好杯子，3秒后将出咖啡！");
                this.store--;
                if (this.store == 0) {
                    this.store = SOLD_OUT;
                }else {
                    this.state = NO_PAY;
                }
                break;
            case SOLD_OUT:
                System.out.println("咖啡已经卖完，不可购买");
        }
    }

}
