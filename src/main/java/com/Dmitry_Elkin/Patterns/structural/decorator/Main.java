package com.Dmitry_Elkin.Patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        //without decorator
        INecessaryOperation bc = new BaseClass();
        bc.someOperation();

        System.out.println("\n\n**********************\n");
        //with decorator
        INecessaryOperation decorator = new Decorator(bc,"Bob");
        decorator.someOperation();
    }
}
