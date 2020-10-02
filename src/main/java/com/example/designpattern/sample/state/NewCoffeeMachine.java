package com.example.designpattern.sample.state;

public class NewCoffeeMachine {

    final State PAY ,NO_PAY,SOLD,SOLD_OUT ;
    int store;
    State state;

    public NewCoffeeMachine(int store) {
        NO_PAY = new NoPayState(this);
        PAY = new PayState(this);
        SOLD = new SoldState(this);
        SOLD_OUT = new SoldOutState(this);

        this.store = store;
        if (this.store > 0) {
            this.state = NO_PAY;
        }
    }

    public void pay() {
        this.state.pay();
    }

    public void refund() {
        this.state.refund();
    }

    public void buy() {
        this.state.buy();
    }

    public void getCoffee() {
        this.state.getCoffee();
    }

}
