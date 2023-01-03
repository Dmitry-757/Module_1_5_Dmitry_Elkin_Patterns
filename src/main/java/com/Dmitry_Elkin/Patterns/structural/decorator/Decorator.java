package com.Dmitry_Elkin.Patterns.structural.decorator;

public class Decorator implements INecessaryOperation{
    INecessaryOperation component;
    String name;

    public Decorator(INecessaryOperation component, String name) {
        this.component = component;
        this.name = name;
    }


    @Override
    public void someOperation() {
        component.someOperation();
        System.out.println(" "+name);
    }
}
