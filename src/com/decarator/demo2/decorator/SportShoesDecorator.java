package com.decarator.demo2.decorator;

import com.decarator.demo2.Decorator;

public class SportShoesDecorator extends Decorator {
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "运动鞋 ";
        System.out.print("穿上"+addedState);
    }
}
