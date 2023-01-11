package com.Dmitry_Elkin.Patterns.behavioral.templateMethod;

public class Main {
    public static void main(String[] args) {
        Additional1 myClass1 = new Additional1();
        myClass1.commonMethod();

        System.out.println();

        Additional2 myClass2 = new Additional2();
        myClass2.commonMethod();

    }
}
