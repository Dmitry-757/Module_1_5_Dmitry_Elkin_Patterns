package com.Dmitry_Elkin.Patterns.structural.decorator;

public class BaseClass implements INecessaryOperation{
    @Override
    public void someOperation() {
        System.out.print("Hello");
    }
}
