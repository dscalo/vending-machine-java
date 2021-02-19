package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void snacksDisplay(ArrayList<Snack> snacks){
        int index = 1;
        for (Snack snack : snacks) {
            /*
             * %s: String
             * %f: Float/double
             * %d: integer
             * */
            System.out.printf("%d: %s $%.2f\n", index, snack.getName(), snack.getPrice());
            index++;
        }
        System.out.print(" Choose a snack or press q to quit ");
    }

    public static void main(String[] args) {
	// write your code here
        ArrayList<Snack> snacks = Snacks.getSnacks("snacks.csv");
        System.out.println("Welcome to Ashley and Amanda's Snack Shop");
        snacksDisplay(snacks);
        Scanner scanner = new Scanner (System.in);
        String choice = scanner.nextLine();

       try {
           int num = Integer.parseInt(choice);

       } catch (Exception e){

       }

    }
}
