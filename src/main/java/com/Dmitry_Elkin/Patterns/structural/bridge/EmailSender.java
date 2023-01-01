package com.Dmitry_Elkin.Patterns.structural.bridge;

public class EmailSender extends DataSender{
    public EmailSender(IDataReader dataReader) {
        super(dataReader);
    }

    @Override
    public String sendData() {
        String data = dataReader.getData();
        System.out.println("Processing "+ data);
        System.out.println("sending by e-mail "+data);
        return data;
    }
}
