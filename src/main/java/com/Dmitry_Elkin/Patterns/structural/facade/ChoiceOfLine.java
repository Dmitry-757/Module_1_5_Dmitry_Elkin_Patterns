package com.Dmitry_Elkin.Patterns.structural.facade;

public class ChoiceOfLine {
    public static int choiceLine(Container container){
//        switch (container){
//            case BOTTLE_1_5 -> System.out.println("line is chosen");
//        }
        int chosenLineId = 3;
        System.out.println("line for bottling to "+container+" is chosen");
        return chosenLineId;
    }
}
