package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String s1 = getInput("Enter 1st value: ");
        String s2 = getInput("Enter 2nd value: ");
        String s3 = getInput("Enter 3rd value: ");
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);

        double result = d1+d2+d3;

        System.out.println("The answer is: " +result);
    }

    private static String getInput(String pronpt) {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(pronpt);
        System.out.flush();
        try {
            return stdin.readLine();
        }
        catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
