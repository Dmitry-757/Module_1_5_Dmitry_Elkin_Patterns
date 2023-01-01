package com.Dmitry_Elkin.Patterns.structural.bridge;

public class MessengerSender extends DataSender{
    public MessengerSender(IDataReader dataReader) {
        super(dataReader);
    }

    @Override
    public String sendData() {
        String data = dataReader.getData();
        System.out.println("Processing "+ data);
        System.out.println("sending by messenger "+data);
        return data;
    }
}
