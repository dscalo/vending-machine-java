package com.company;
// haha
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void snacksDisplay(ArrayList<Snack> snacks){
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
        System.out.print(" Choose a snack or press q to quit ");
    }

    public static void snackDisplay(Snack snack) {
        System.out.printf("%s $%.2f\n", snack.getName(), snack.getPrice());
        System.out.println(snack.getDesc());
    }

    public static void main(String[] args) {
	// write your code here
        ArrayList<Snack> snacks = Snacks.getSnacks("snacks.csv");
        Scanner scanner = new Scanner (System.in);

        while(true) {
            snacksDisplay(snacks);

            String choice = scanner.nextLine();
            choice = choice.replace("\n", "");

            if (choice.equals("q")  || choice.equals("Q") ) {
                System.out.println("Exiting!, have a nice day");
                break;
            }
            try {
                int snackIndex = Integer.parseInt(choice) -1;

                if (snackIndex < 0 || snackIndex >= snacks.size()) {
                    continue;
                }

                Snack snack = snacks.get(snackIndex);
                snackDisplay(snack);



            } catch (Exception e) {
                System.out.println("Invalid selection, please choose a snack or press q to quit");
            }

        }

    }
}
