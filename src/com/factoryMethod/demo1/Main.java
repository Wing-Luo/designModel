package com.factoryMethod.demo1;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AddFactory();
        Calcu calcu = abstractFactory.createCalcu();
        calcu.a = 1.0;
        calcu.b = 2.0;
        System.out.println(calcu.getResult());

    }
}
