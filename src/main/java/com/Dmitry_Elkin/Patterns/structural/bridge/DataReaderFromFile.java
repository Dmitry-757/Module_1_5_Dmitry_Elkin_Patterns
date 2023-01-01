package com.Dmitry_Elkin.Patterns.structural.bridge;

public class DataReaderFromFile implements IDataReader{
    @Override
    public String getData() {
        System.out.println("read data from file...");
        return "data from file";
    }
}
