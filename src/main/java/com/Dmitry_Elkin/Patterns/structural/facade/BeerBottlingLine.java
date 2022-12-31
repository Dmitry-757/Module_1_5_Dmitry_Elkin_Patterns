package com.Dmitry_Elkin.Patterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class BeerBottlingLine {
    private int lineId;
    private List<Object> necessaryComponents = new ArrayList<>();

    public BeerBottlingLine(int lineID) {
        this.lineId = lineID;
    }


    public void loadComponent(Object component){
        necessaryComponents.add(component);
        System.out.println("Component "+component+" was loaded to line");
    }

    public void connectToTank(String beerName){
        System.out.println("line is connected to "+beerName+" tank");
    }

    public boolean lineTest(){
        System.out.println("Line "+lineId+" was passed the test");
        return true;
    }

}
