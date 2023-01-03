package com.Dmitry_Elkin.Patterns.generative.factory;

public class MessengerSender implements IMessageSender{
    @Override
    public void sendMessage() {
        System.out.println("sending message by messenger...");
    }
}
