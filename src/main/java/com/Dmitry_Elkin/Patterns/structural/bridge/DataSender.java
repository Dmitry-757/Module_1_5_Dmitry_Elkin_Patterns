package com.Dmitry_Elkin.Patterns.structural.bridge;

abstract class DataSender {
    protected IDataReader dataReader;

    public DataSender(IDataReader dataReader) {
        this.dataReader = dataReader;
    }

    public void setDataReader(IDataReader dataReader) {
        this.dataReader = dataReader;
    }


    public abstract String sendData();
}
