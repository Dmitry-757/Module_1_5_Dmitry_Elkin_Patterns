package com.Dmitry_Elkin.Patterns.structural.bridge;


public class Main {
    public static void main(String[] args) {

        IDataReader fr = new DataReaderFromFile();
        IDataReader dbr = new DataReaderFromDB();
        IDataReader httpr = new DataReaderFromHttp();

        DataSender ds = new EmailSender(fr);
        ds.sendData();
        ds.setDataReader(dbr);
        ds.sendData();
        ds.setDataReader(httpr);
        ds.sendData();
        System.out.println("\n******************\n");

        ds = new MessengerSender(fr);
        ds.sendData();
        ds.setDataReader(dbr);
        ds.sendData();
        ds.setDataReader(httpr);
        ds.sendData();
        System.out.println("\n******************\n");


    }

}
