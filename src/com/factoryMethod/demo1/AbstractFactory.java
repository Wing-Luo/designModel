package com.factoryMethod.demo1;

public interface AbstractFactory {
    Calcu createCalcu();
}

class AddFactory implements AbstractFactory{
    @Override
    public Calcu createCalcu() {
        return new AddCalcu();
    }
}
class ReduceFactory implements AbstractFactory{
    @Override
    public Calcu createCalcu() {
        return new ReduceCalcu();
    }
}
