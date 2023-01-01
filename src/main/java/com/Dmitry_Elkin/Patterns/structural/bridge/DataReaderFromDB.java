package com.Dmitry_Elkin.Patterns.structural.bridge;

public class DataReaderFromDB implements IDataReader{
    @Override
    public String getData() {
        System.out.println("reading data from DB...");
        return "dta from DB";
    }
}
