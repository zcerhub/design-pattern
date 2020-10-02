package com.example.designpattern.sample.state;

public class NoPayState implements State {

    private NewCoffeeMachine machine;

    public NoPayState(NewCoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public void pay() {
        System.out.println("支付成功，请去确定购买咖啡");
        this.machine.state=this.machine.PAY;
    }

    @Override
    public void refund() {
        System.out.println("你尚未支付，请扫二维码");
    }

    @Override
    public void buy() {
        System.out.println("你尚未支付，请扫二维码");
    }

    @Override
    public void getCoffee() {
        System.out.println("你尚未支付，请扫二维码");
    }
}
