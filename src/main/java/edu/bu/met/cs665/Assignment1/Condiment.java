package edu.bu.met.cs665.Assignment1;

import java.util.Scanner;

public class Condiment {
    static int maxMilk = 3;
    static int maxSugar = 3;
    static String[] condimentList = {"Milk", "Sugar"};
    static String maxMilkError = "Cannot add more than " + maxMilk + " units of milk.";
    static String maxSugarError = "Cannot add more than " + maxSugar + " units of sugar.";

    /**
     * Allows the user to add milk or sugar to their drink.
     * @param cost The current cost of the beverage.
     */
    public static void addCondiment(double cost) {
        char userAddedCondiments;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Would you like to add milk or sugar to your drink ?");
            System.out.println();
            System.out.println("1. Milk");
            System.out.println("2. Sugar");
            System.out.println("3. Checkout");

            userAddedCondiments = sc.next().charAt(0);

            if (userAddedCondiments - '0' == 1) {
                cost = Milk.addMilk(cost);
            } else if (userAddedCondiments - '0' == 2) {
                cost = Sugar.addSugar(cost);
            } else{
                System.out.println("Your total is: " + cost);
                return;

            }
        } while (true);
    }

    /**
     * Displays a prompt for the user to select the quantity of a condiment to add.
     * @param condimentType The type of condiment (e.g., "Milk", "Sugar").
     */
    public static void selectQuantity(String condimentType) {
        System.out.println("How much " + condimentType + " do you want to add? Please select a quantity between 1 to 3.");
    }
}
