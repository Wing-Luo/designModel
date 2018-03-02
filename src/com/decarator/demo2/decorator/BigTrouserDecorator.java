package com.decarator.demo2.decorator;

import com.decarator.demo2.Decorator;

public class BigTrouserDecorator extends Decorator {
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "垮裤 ";
        System.out.print("穿上"+addedState);
    }
}
