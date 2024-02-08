package edu.bu.met.cs665.Assignment1;


import java.util.Scanner;

public class Milk extends Condiment{

    /**
     * Adds milk to the beverage, updating the cost and quantity of available milk.
     * @param cost The current cost of the beverage.
     * @return The updated cost of the beverage after adding milk.
     */
    public static double addMilk(double cost) {
        double addedMilkQuantity;
        Scanner sc = new Scanner(System.in);

        selectQuantity(condimentList[0]);
        addedMilkQuantity = sc.nextInt();

        if (addedMilkQuantity > maxMilk) {
            System.out.println(maxMilkError);
        } else {
            maxMilk -= (int) addedMilkQuantity;
            cost += addedMilkQuantity * Price.condimentPrice;
            System.out.println("Milk added to the beverage.");
        }
        return cost;
    }
}
