package com.decarator.demo2;

import com.decarator.demo2.decorator.BigTrouserDecorator;
import com.decarator.demo2.decorator.SportShoesDecorator;
import com.decarator.demo2.decorator.TShirtDecorator;

public class Mian {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        TShirtDecorator t = new TShirtDecorator();
        BigTrouserDecorator bt = new BigTrouserDecorator();
        SportShoesDecorator ss = new SportShoesDecorator();
        t.setComponent(c);
        bt.setComponent(t);
        ss.setComponent(bt);

        ss.operation();



    }
}