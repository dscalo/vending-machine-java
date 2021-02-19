package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Snack> snacks = Snacks.getSnacks("snacks.csv");

        System.out.println("Welcome to Ashley and Amanda's Snack Shop");
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
    }
}
