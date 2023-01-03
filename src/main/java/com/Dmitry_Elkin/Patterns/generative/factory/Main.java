package com.Dmitry_Elkin.Patterns.generative.factory;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Optional<IMessageSender> emailSender = Optional.empty();
        Optional<IMessageSender> messengerSender = Optional.empty();
        Optional<IMessageSender> otherSender = Optional.empty();

        try{
            emailSender = Optional.ofNullable(factory.getSender("email"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            messengerSender = Optional.ofNullable(factory.getSender("messenger"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            otherSender = Optional.ofNullable(factory.getSender("other"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        emailSender.ifPresentOrElse(IMessageSender::sendMessage,()-> System.out.println("this type of messenger is not defined!"));
        messengerSender.ifPresentOrElse(s->s.sendMessage(),()-> System.out.println("this type of messenger is not defined!"));
        otherSender.ifPresentOrElse(s->s.sendMessage(),()-> System.out.println("this type of messenger is not defined!"));

    }
}
