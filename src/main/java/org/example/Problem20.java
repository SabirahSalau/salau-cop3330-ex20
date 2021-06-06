/*
 *  UCF COP3330 Summer 2021 Assignment 20 Solution
 *  Copyright 2021 Sabirah Salau
 */


package org.example;

import java.util.Scanner;

public class Problem20
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double tax;
        double total;



        System.out.println("What is the order amount?");
        double order = input.nextDouble();

        System.out.println("What state do you live in?");
        String state = input.next().toUpperCase();

        if(state.equals("WISCONSIN"))
        {
            System.out.println("What county do you live in?");

            String county = input.nextLine().toUpperCase();
            county = input.nextLine().toUpperCase();

            if(county.equals("EAU CLAIRE"))
            {
                tax = order * (0.055);
                total = order + tax;

                System.out.printf("The tax is:$%.2f.\nThe total is:$%.2f", tax, total);
            }
            else if(county.equals("DUNN"))
            {
                tax = order * (0.054);
                total = order + tax;

                System.out.printf("The tax is:$%.2f.\nThe total is:$%.2f", tax, total);
            }
            else
            {
                tax = order * 0.05;
                total = order + tax;

                System.out.printf("The tax is:$%.2f.\nThe total is:$%.2f", tax, total);
            }

        }
        else if(state.equals("ILLINOIS"))
        {
            tax = order * 0.08;
            total = order + tax;

            System.out.printf("The tax is:$%.2f.\nThe total is:$%.2f", tax, total);
        }
        else
        {
            total = order;
            System.out.printf("The total is:$%.2f\n", total);
        }
    }
}
