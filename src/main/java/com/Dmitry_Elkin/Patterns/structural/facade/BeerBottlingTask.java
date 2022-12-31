package com.Dmitry_Elkin.Patterns.structural.facade;

public class BeerBottlingTask {
    private String beerName;
    private int volume;
    private Container container;

    public BeerBottlingTask(String beerName, int volume, Container container) {
        this.beerName = beerName;
        this.volume = volume;
        this.container = container;
    }


    public String getBeerName() {
        return beerName;
    }

    public int getVolume() {
        return volume;
    }

    public Container getContainer() {
        return container;
    }
}
