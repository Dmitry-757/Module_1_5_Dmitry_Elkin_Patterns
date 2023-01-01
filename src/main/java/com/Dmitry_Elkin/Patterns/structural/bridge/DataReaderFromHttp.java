package com.Dmitry_Elkin.Patterns.structural.bridge;

public class DataReaderFromHttp implements IDataReader{
    @Override
    public String getData() {
        System.out.println("parsing data from http...");
        return "data from http";
    }
}
