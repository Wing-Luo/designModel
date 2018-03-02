package com.factoryMethod.demo1;

public abstract class Calcu {
    protected Double a;
    protected Double b;
    abstract Double getResult();
}
class AddCalcu extends Calcu{
    @Override
    Double getResult() {
        return a+b;
    }
}
class ReduceCalcu extends Calcu{
    @Override
    Double getResult() {
        return a-b;
    }
}