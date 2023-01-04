package com.Dmitry_Elkin.Patterns.behavioral.chainOfResponsibility;

public class GetPlanFilter implements IFilter {
    private IFilter nextFilter;

    public void setNextFilter(IFilter nextFilter) {
        this.nextFilter = nextFilter;
    }


    @Override
    public void doFilter(String message) {


        //to do with message
        // Раскладываем адрес на составляющие
        String[] list = message.split("/");
        boolean PlanIsPresent = false;
        String plan="";
        for (String param : list) {
            if (param.contains("greatPlan1=")) {
                PlanIsPresent = true;
                plan = param;
                break;
            }
        }

        if (PlanIsPresent) {
            System.out.println(plan);
        } else {
            System.out.println("the greatest plan is not ready yet ((");
        }
        if (nextFilter != null) {
            nextFilter.doFilter(message);
        }

    }
}
