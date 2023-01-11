package com.Dmitry_Elkin.Patterns.behavioral.templateMethod;

public class Additional1 extends Template{
    @Override
    void additionalMeth() {        //тут допишем дополнительную к Template логику
        System.out.println("additional meth_1");
    }
}
