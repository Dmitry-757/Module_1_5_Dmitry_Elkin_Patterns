package com.Dmitry_Elkin.Patterns.generative.singleton;

public class DBConnection implements IDBConnection{
    private static DBConnection INSTANCE;

    private DBConnection() {
    }

    public static DBConnection getInstance(){
        if (INSTANCE == null){
            INSTANCE = new DBConnection();
        }
        return INSTANCE;
    }

    @Override
    public String getConnection() {
        return "some DB connection";
    }
}
