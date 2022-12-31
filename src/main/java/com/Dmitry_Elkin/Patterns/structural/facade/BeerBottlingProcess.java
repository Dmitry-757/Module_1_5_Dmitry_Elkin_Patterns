package com.Dmitry_Elkin.Patterns.structural.facade;

public class BeerBottlingProcess {
    private BeerBottlingTask task;
    private BeerBottlingLine line;

    public BeerBottlingProcess(BeerBottlingTask task, BeerBottlingLine line) {
        this.task = task;
        this.line = line;
    }

    public void beerBottlingStart(){
        System.out.println("Process of bottling "+task.getBeerName()+" to "+task.getContainer()+" was started.");
    }
}
