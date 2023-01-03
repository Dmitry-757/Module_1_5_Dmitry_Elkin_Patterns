package com.Dmitry_Elkin.Patterns.generative.singleton;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection1 = DBConnection.getInstance();
        DBConnection dbConnection2 = DBConnection.getInstance();

        System.out.println(dbConnection1);
        System.out.println(dbConnection2);

    }
}
