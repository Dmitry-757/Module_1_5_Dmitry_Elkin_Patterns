package com.Dmitry_Elkin.Patterns.behavioral.chainOfResponsibility;

public class AuthenticationFilter implements IFilter {
    private IFilter nextFilter;

    public void setNextFilter(IFilter nextFilter) {
        this.nextFilter = nextFilter;
    }


    @Override
    public void doFilter(String message) {


        //to do with message
        // Раскладываем адрес на составляющие
        String[] list = message.split("/");
        boolean authenticated = false;
        for (String param : list) {
            if ((param.contains("login=user") && param.contains("pass=123"))
                    ||(param.contains("login=user2") && param.contains("pass=321")))
            {
                authenticated = true;
                break;
            }
        }

        if (authenticated) {
            System.out.println("authentication filter was passed...");
            if (nextFilter != null) {
                nextFilter.doFilter(message);
            }
        }
        else{
            System.out.println("authenticating info is wrong or absent!");
        }
    }
}
