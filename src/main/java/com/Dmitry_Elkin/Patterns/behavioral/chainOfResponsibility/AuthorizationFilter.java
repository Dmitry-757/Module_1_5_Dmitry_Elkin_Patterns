package com.Dmitry_Elkin.Patterns.behavioral.chainOfResponsibility;

public class AuthorizationFilter implements IFilter {
    private IFilter nextFilter;

    public void setNextFilter(IFilter nextFilter) {
        this.nextFilter = nextFilter;
    }


    @Override
    public void doFilter(String message) {


        //to do with message
        // Раскладываем адрес на составляющие
        String[] list = message.split("/");
        boolean authorized = false;
        boolean hasGreatestPlans = false;
        for (String param : list) {
            if (param.contains("login=user2") && param.contains("pass=321"))
            {
                authorized = true;
            }
            if (param.contains("greatestPlans"))
            {
                hasGreatestPlans = true;
            }
        }

        if (hasGreatestPlans) {
            if (authorized) {
                System.out.println("authorize filter was passed...");
            } else {
                System.out.println("you hasn`t permission to access to greatest pentagon plans!");
            }
        }
        if (nextFilter != null) {
            nextFilter.doFilter(message);
        }

    }
}
