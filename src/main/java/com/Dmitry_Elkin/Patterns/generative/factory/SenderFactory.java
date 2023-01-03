package com.Dmitry_Elkin.Patterns.generative.factory;

public class SenderFactory {
    public IMessageSender getSender(String senderType){
        return switch (senderType){
            case "email" -> new EmailSender();
            case "messenger" -> new MessengerSender();
            default -> throw new IllegalStateException("Unexpected value: " + senderType);
        };
    }
}
