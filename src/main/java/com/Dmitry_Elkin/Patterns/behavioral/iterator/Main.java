package com.Dmitry_Elkin.Patterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        ConcreteAggregate ca = new ConcreteAggregate();
        IIterator iterator = ca.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
