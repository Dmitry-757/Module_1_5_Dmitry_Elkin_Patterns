package com.Dmitry_Elkin.Patterns.behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        String processingMessage = "www.pentagon.gov/greatestPlans/greatPlan1=take away the chamber pot from putin/?login=user&pass=123";

        AuthenticationFilter filter1 = new AuthenticationFilter();
        AuthorizationFilter filter2 = new AuthorizationFilter();
        GetPlanFilter filter3 = new GetPlanFilter();
        filter1.setNextFilter(filter2);
        filter2.setNextFilter(filter3);

        filter1.doFilter(processingMessage);

        System.out.println("\n********************\n");

        String processingMessage2 = "www.pentagon.gov/greatestPlans/greatPlan1=take away the chamber pot from putin/?login=user2&pass=321";
        filter1.doFilter(processingMessage2);
    }
}
