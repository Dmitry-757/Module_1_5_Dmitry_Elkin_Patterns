package com.Dmitry_Elkin.Patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        Container container = Container.STEEL_KEG_50;
        BeerBottlingTask task = new BeerBottlingTask("Zhigulevskoe",1000,container);
        System.out.println("Task for bottling "+task.getBeerName()+" is received");
        int necessaryContainerNumber = (int)(task.getVolume() / container.getValue());


        boolean componentsTest = (
                ComponentAvailabilityCheck.beerValueIsAvailable(task.getBeerName(),task.getVolume())
                        &&
                        ComponentAvailabilityCheck.kegNumberIsAvailable(container, necessaryContainerNumber)
                        &&
                        ComponentAvailabilityCheck.beerValueIsAvailable(task.getBeerName(),necessaryContainerNumber)
                );
        if (componentsTest){
            System.out.println("All components are available");

            int lineId=
            switch (container){
                case BOTTLE_1_5 ->1;
                case BOTTLE_3_0 -> 2;
                case PET_KEG_10 -> 3;
                case PET_KEG_20 -> 3;
                case PET_KEG_30 -> 3;
                case STEEL_KEG_25 -> 4;
                case STEEL_KEG_50 -> 4;
            };
            System.out.println("Line "+lineId+" was chosen for bottling");
            BeerBottlingLine line = new BeerBottlingLine(lineId);
            line.loadComponent("Labels");
            line.loadComponent("Containers");
            line.connectToTank(task.getBeerName());
            if(line.lineTest()){
                BeerBottlingProcess process = new BeerBottlingProcess(task, line);
                process.beerBottlingStart();
            }

        }

        System.out.println("\n****************************************\n");
        container = Container.STEEL_KEG_25;
        BeerBottlingTask task2 = new BeerBottlingTask("CorunaCheskaj",1500, container);
        System.out.println("Task for bottling "+task2.getBeerName()+" is received");

        //все составляющие выполняются внутри метода - нам нужно только вызвать его и подать на вход задание
        doBottlingUsingFacade(task2);

    }



    public static void doBottlingUsingFacade(BeerBottlingTask task ){
        Container container = task.getContainer();
        int necessaryContainerNumber = (int)(task.getVolume() / container.getValue());


        boolean componentsTest = (
                ComponentAvailabilityCheck.beerValueIsAvailable(task.getBeerName(),task.getVolume())
                        &&
                        ComponentAvailabilityCheck.kegNumberIsAvailable(container, necessaryContainerNumber)
                        &&
                        ComponentAvailabilityCheck.beerValueIsAvailable(task.getBeerName(),necessaryContainerNumber)
        );
        if (componentsTest){
            System.out.println("All components are available");

            int lineId=
                    switch (container){
                        case BOTTLE_1_5 ->1;
                        case BOTTLE_3_0 -> 2;
                        case PET_KEG_10 -> 3;
                        case PET_KEG_20 -> 3;
                        case PET_KEG_30 -> 3;
                        case STEEL_KEG_25 -> 4;
                        case STEEL_KEG_50 -> 4;
                    };
            System.out.println("Line "+lineId+" was chosen for bottling");
            BeerBottlingLine line = new BeerBottlingLine(lineId);
            line.loadComponent("Labels");
            line.loadComponent("Containers");
            line.connectToTank(task.getBeerName());
            if(line.lineTest()){
                BeerBottlingProcess process = new BeerBottlingProcess(task, line);
                process.beerBottlingStart();
            }

        }

    }

}
