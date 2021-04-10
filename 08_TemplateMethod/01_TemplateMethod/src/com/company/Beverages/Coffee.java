package com.company.Beverages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Coffee extends Beverage {
    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }
        catch (IOException ioe) {
            System.err.println("IO error trying trying to red your answer");
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }

    @Override
    public void brew() {
        System.out.println("Dripping coffee thrugh filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
