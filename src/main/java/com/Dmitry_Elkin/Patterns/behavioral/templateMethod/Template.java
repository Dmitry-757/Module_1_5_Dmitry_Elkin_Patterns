package com.Dmitry_Elkin.Patterns.behavioral.templateMethod;

public abstract class Template {
    void commonMethod(){
        System.out.println("common action1");
        additionalMeth();
        System.out.println("common action3");
    }
    abstract void additionalMeth();
}
